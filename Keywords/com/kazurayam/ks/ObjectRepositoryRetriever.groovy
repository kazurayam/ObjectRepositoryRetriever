package com.kazurayam.ks

import java.nio.file.Files
import java.nio.file.Path

import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.MobileTestObject
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.WindowsTestObject


public class ObjectRepositoryRetriever {

	public static List<TestObject> readTestObjectFiles(Path projectDir) {
		Path objectRepositoryDir = projectDir.resolve("Object Repository")
		assert Files.exists(objectRepositoryDir)
		List<TestObject> testObjects = new ArrayList<>()
		Files.walk(objectRepositoryDir)
				.sorted(Comparator.naturalOrder())
				.filter({ p -> p.toFile().isFile() })
				.forEach({ p ->
					String testObjectId = getTestObjectId(objectRepositoryDir, p)
					TestObject to = ObjectRepository.readTestObjectFile(testObjectId, p.toFile(), projectDir.toFile().toString())
					// include WebUI TestObject only; exclude MobileTestObject and RequestObject
					if (!(to instanceof MobileTestObject) && !(to instanceof RequestObject)) {
						// how to exclude WindwsTestObject? I don't know.
						testObjects.add(to)
					}
				})
		return testObjects
	}

	/**
	 * Given with objectRepositoryDir="/Users/my/prj/Object Repository"
	 * and with testObjectFile="/Users/my/prj/Object Repository/Page_AppointmentConfirmation/lbl_Comment.rs"
	 * then will return "Object Repository/Page_AppointmentConfirmation/lbl_Comment"
	 */
	public static String getTestObjectId(Path objectRepositoryDir, Path testObjectFile) {
		Path relativePath = objectRepositoryDir.relativize(testObjectFile)
		String str = relativePath.toString()
		return str.substring(0, str.lastIndexOf('.'))
	}
}
