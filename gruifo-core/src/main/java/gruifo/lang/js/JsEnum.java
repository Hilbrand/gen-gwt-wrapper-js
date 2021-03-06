/*
 * Copyright Hilbrand Bouwkamp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package gruifo.lang.js;

public class JsEnum {

  private final String fieldName;
  private final String jsDoc;

  public JsEnum(final String name, final String jsDoc) {
    fieldName = name;
    this.jsDoc = jsDoc;
  }

  public String getFieldName() {
    return fieldName;
  }

  public String getJsDoc() {
    return jsDoc;
  }

  @Override
  public String toString() {
    return "JsEnum [fieldName=" + fieldName + ", jsDoc=" + jsDoc + "]";
  }
}
