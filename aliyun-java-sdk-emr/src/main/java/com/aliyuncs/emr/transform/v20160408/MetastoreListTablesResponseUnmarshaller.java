/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.MetastoreListTablesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class MetastoreListTablesResponseUnmarshaller {

	public static MetastoreListTablesResponse unmarshall(MetastoreListTablesResponse metastoreListTablesResponse, UnmarshallerContext context) {
		
		metastoreListTablesResponse.setRequestId(context.stringValue("MetastoreListTablesResponse.RequestId"));

		List<String> tableNames = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("MetastoreListTablesResponse.TableNames.Length"); i++) {
			tableNames.add(context.stringValue("MetastoreListTablesResponse.TableNames["+ i +"]"));
		}
		metastoreListTablesResponse.setTableNames(tableNames);
	 
	 	return metastoreListTablesResponse;
	}
}