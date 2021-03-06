/**
 *  Copyright 2012 Diego Ceccarelli
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package it.cnr.isti.hpc.dexter.label;

import java.util.Set;

/**
 * IdToArticle stores the map <code> wiki-id  -> label </code>
 *
 * @author Diego Ceccarelli, diego.ceccarelli@isti.cnr.it
 * created on 05/lug/2012
 */
public interface IdToLabel {

	/**
	 * @param key 
	 * @return the label associated with key, empty string if there's no label
	 */
	public String getLabel(Integer key);

	/**
	 * @return Returns a Set view of the keys (wiki-id) contained in this map.
	 */
	public Set<Integer> getIds();
}
