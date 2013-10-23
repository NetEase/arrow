## Introduction

Arrow is a TestNG plugin providing several intersting features mainly for QA engineers.

## Features

* Integrate test class/method author from Javadoc into emailable HTML report
* Re-run failed test cases

## How to Use

1. Add arrow.jar to project libs
2. Add listeners in ant build.xml or testng.xml

* build.xml add listeners sample

```
<target name="testng" depends="compile">
    <mkdir dir="test-output" />
	<testng outputDir="test-output" classpathref="runpath"
		haltonfailure="fasle" listeners="com.netease.qa.testng.PowerEmailableReporter, 
		com.netease.qa.testng.RetryListener, com.netease.qa.testng.TestResultListener">
		<xmlfileset dir="." includes="${testngxml}.xml" />
	</testng>
</target>
```


* testng.xml add listeners sample

```
<listeners>
    <listener class-name="com.netease.qa.testng.TestResultListener" />
    <listener class-name="com.netease.qa.testng.RetryListener" />
    <listener class-name="com.netease.qa.testng.PowerEmailableReporter" />
</listeners>
```

## Contributors

* NetEase, Inc.

## How to Contribute

Any contribution listed bellow is welcomed:

* add/edit wiki
* report/fix issue
* code review
* commit new feature
* add testcase/demo

Meanwhile it is recommended to follow the rules below:

* It's *NOT* recommended to submit a pull request directly to Arrow's `master` branch. `develop` branch is more appropriate
* Follow common Java coding conventions
* Add the following [license](#license) in each Java class file

## License

(The Apache License)

Copyright (c) 2012-2013 NetEase, Inc. and other contributors

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.