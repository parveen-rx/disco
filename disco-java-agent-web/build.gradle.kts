/*
 * Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License").
 *   You may not use this file except in compliance with the License.
 *   A copy of the License is located at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   or in the "license" file accompanying this file. This file is distributed
 *   on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 *   express or implied. See the License for the specific language governing
 *   permissions and limitations under the License.
 */

dependencies {
    compile(project(":disco-java-agent:disco-java-agent-core"))
    testCompile("junit", "junit", "4.12")
    testCompile("org.mockito", "mockito-core", "1.+")
    testCompile("javax.servlet", "javax.servlet-api", "3.0.1")
    testCompile("org.apache.httpcomponents", "httpclient", "4.5.10")
}

configure<PublishingExtension> {
    publications {
        named<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}