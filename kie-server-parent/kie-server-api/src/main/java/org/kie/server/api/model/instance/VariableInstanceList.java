/*
 * Copyright 2015 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.kie.server.api.model.instance;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "variable-instance-list")
public class VariableInstanceList {

    @XmlElement(name="variable-instance")
    private VariableInstance[] variableInstances;

    public VariableInstanceList() {
    }

    public VariableInstanceList(VariableInstance[] variableInstances) {
        this.variableInstances = variableInstances;
    }

    public VariableInstanceList(List<VariableInstance> variableInstances) {
        this.variableInstances = variableInstances.toArray(new VariableInstance[variableInstances.size()]);
    }

    public VariableInstance[] getVariableInstances() {
        return variableInstances;
    }

    public void setVariableInstances(VariableInstance[] variableInstances) {
        this.variableInstances = variableInstances;
    }
}
