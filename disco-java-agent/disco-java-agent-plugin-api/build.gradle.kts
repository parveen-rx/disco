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
    //TODO update BB and ASM to latest
    compile("net.bytebuddy", "byte-buddy-dep", "1.9.12")
    compile("org.ow2.asm", "asm", "7.1")
    compile("org.ow2.asm", "asm-commons", "7.1")
    compile("org.ow2.asm", "asm-tree", "7.1")
}

configure<PublishingExtension> {
    publications {
        named<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}
