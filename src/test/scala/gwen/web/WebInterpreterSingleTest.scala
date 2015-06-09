/*
 * Copyright 2014-2015 Brady Wood, Branko Juric
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package gwen.web

class WebInterpreterSerialSingleTest extends WebInterpreterTest {

  "Single floodio test feature" should "should evaluate" in {
    evaluate(List("features/floodio"), false, "target/report-single-floodio")
  }
  
  "Single etsy test feature" should "should evaluate" in {
    evaluate(List("features/etsy"), false, "target/report-single-etsy")
  }
  
}