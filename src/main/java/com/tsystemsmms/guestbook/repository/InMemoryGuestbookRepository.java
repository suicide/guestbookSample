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
package com.tsystemsmms.guestbook.repository;

import com.tsystemsmms.guestbook.model.GuestbookEntry;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * TODO: Comment
 *
 * @author Patrick Sy (patrick.sy@get-it.us)
 */
@Repository
public class InMemoryGuestbookRepository implements GuestbookRepository {

  private final List<GuestbookEntry> storage;

  public InMemoryGuestbookRepository() {
    storage = new ArrayList<>();
  }

  @Override
  public void add(GuestbookEntry entry) {
    storage.add(entry);
  }

  @Override
  public List<GuestbookEntry> list() {
    return Collections.unmodifiableList(storage);
  }
}
