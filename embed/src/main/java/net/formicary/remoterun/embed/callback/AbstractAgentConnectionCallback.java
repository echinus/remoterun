/*
 * Copyright 2015 Formicary Ltd
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

package net.formicary.remoterun.embed.callback;

import net.formicary.remoterun.common.proto.RemoteRun;
import net.formicary.remoterun.embed.AgentConnection;

/**
 * Convenience class to avoid having to implement all methods in AgentConnectionCallback.
 *
 * @author Chris Pearson
 */
public class AbstractAgentConnectionCallback implements AgentConnectionCallback {
  @Override
  public void agentConnected(AgentConnection agentConnection) {

  }

  @Override
  public void messageReceived(AgentConnection agentConnection, RemoteRun.AgentToMaster message) throws Exception {

  }

  @Override
  public void agentDisconnected(AgentConnection agentConnection) {

  }
}