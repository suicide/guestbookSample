/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tsystemsmms.guestbook.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Hallo Welt!
 *
 * @author Patrick Sy (patrick.sy@get-it.us)
 */
@Controller
public class HelloWorldController {


  @RequestMapping("/hello")
  public String helloWorld() {
    return "helloWorld";
  }

  @RequestMapping("/hello/{name}")
  public String hello(@PathVariable("name") String name, Model model) {

    model.addAttribute("name", name);

    return "hello";

  }

}
