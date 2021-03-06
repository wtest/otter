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

package com.alibaba.otter.node.common.config;

import java.util.List;

import com.alibaba.otter.node.common.config.model.NodeTask;

/**
 * 在nodeTask发生变化时，广播通知下
 * 
 * @author jianghang 2012-4-20 下午10:45:17
 * @version 4.0.2
 */
public interface NodeTaskListener {

    boolean process(List<NodeTask> nodeTasks);
}
