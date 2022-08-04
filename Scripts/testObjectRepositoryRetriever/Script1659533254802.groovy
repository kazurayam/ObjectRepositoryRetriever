import java.nio.file.Path
import java.nio.file.Paths

import com.kazurayam.ks.ObjectRepositoryRetriever
import com.kazurayam.ks.TestObjectToJsonConverter
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.TestObject

Path projectDir = Paths.get(RunConfiguration.getProjectDir())

List<TestObject> testObjects = ObjectRepositoryRetriever.readTestObjectFiles(projectDir)

assert testObjects.size() > 0
println testObjects.size()

testObjects.forEach({ to ->
	println TestObjectToJsonConverter.toJson(to, true)
})