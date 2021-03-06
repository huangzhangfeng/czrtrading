/*******************************************************************************
 * Copyright (c) 2011-2012 Cyan Spring Limited
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms specified by license file attached.
 * 
 * Software distributed under the License is released on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, 
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 ******************************************************************************/
package com.cyanspring.cstw.event;

import java.util.List;
import java.util.Map;

import com.cyanspring.common.event.AsyncEvent;

public abstract class ObjectSelectionEvent extends AsyncEvent {
	Map<String, Object> data;
	List<String> editableFields;
	
	public ObjectSelectionEvent(Map<String, Object> data,
			List<String> editableFields) {
		super();
		this.data = data;
		this.editableFields = editableFields;
	}

	public Map<String, Object> getData() {
		return data;
	}

	public List<String> getEditableFields() {
		return editableFields;
	}


}
