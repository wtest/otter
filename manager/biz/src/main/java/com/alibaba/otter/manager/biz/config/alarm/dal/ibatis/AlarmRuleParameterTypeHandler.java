/*
   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package com.alibaba.otter.manager.biz.config.alarm.dal.ibatis;

import java.sql.SQLException;

import com.alibaba.otter.manager.biz.config.alarm.dal.dataobject.AlarmRuleParameter;
import com.alibaba.otter.shared.common.utils.JsonUtils;
import com.ibatis.sqlmap.client.extensions.ParameterSetter;
import com.ibatis.sqlmap.client.extensions.ResultGetter;
import com.ibatis.sqlmap.client.extensions.TypeHandlerCallback;

/**
 * 用于AlarmRuleParameter的解析
 * 
 * @author simon
 */
public class AlarmRuleParameterTypeHandler implements TypeHandlerCallback {

    @Override
    public void setParameter(ParameterSetter setter, Object parameter) throws SQLException {
        setter.setString(JsonUtils.marshalToString(parameter));
    }

    @Override
    public Object getResult(ResultGetter getter) throws SQLException {
        return JsonUtils.unmarshalFromString(getter.getString(), AlarmRuleParameter.class);
    }

    public Object valueOf(String s) {
        return JsonUtils.unmarshalFromString(s, AlarmRuleParameter.class);
    }

}
