/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// camel-k: language=groovy

def parameters = 'topicName=${camel.kamelet.salesforce-source.salesforce-credentials.topicName}&' +
        'query=${camel.kamelet.salesforce-source.salesforce-credentials.query}&' +
        'clientId=${camel.kamelet.salesforce-source.salesforce-credentials.clientId}&' +
        'clientSecret=${camel.kamelet.salesforce-source.salesforce-credentials.clientSecret}&' +
        'userName=${camel.kamelet.salesforce-source.salesforce-credentials.userName}&' +
        'password=${camel.kamelet.salesforce-source.salesforce-credentials.password}&' +
        'loginUrl=${camel.kamelet.salesforce-source.salesforce-credentials.loginUrl}'

from("kamelet:salesforce-source?$parameters")
    .to('log:info')
