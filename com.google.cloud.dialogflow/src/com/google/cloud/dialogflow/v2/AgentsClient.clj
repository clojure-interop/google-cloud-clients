(ns com.google.cloud.dialogflow.v2.AgentsClient
  "Service Description: Agents are best described as Natural Language Understanding (NLU) modules
  that transform user requests into actionable data. You can include agents in your app, product,
  or service to determine user intent and respond to the user in a natural way.

  After you create an agent, you can add [Intents][google.cloud.dialogflow.v2.Intents],
  [Contexts][google.cloud.dialogflow.v2.Contexts], [Entity
  Types][google.cloud.dialogflow.v2.EntityTypes],
  [Webhooks][google.cloud.dialogflow.v2.WebhookRequest], and so on to manage the flow of a
  conversation and match user input to predefined intents and actions.

  You can create an agent using both Dialogflow Standard Edition and Dialogflow Enterprise
  Edition. For details, see [Dialogflow
  Editions](https://cloud.google.com/dialogflow/docs/editions).

  You can save your agent for backup or versioning by exporting the agent by using the
  [ExportAgent][google.cloud.dialogflow.v2.Agents.ExportAgent] method. You can import a saved agent
  by using the [ImportAgent][google.cloud.dialogflow.v2.Agents.ImportAgent] method.

  Dialogflow provides several [prebuilt
  agents](https://cloud.google.com/dialogflow/docs/agents-prebuilt) for common conversation
  scenarios such as determining a date and time, converting currency, and so on.

  For more information about agents, see the [Dialogflow
  documentation](https://cloud.google.com/dialogflow/docs/agents-overview).

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (AgentsClient agentsClient = AgentsClient.create()) {
    Agent agent = Agent.newBuilder().build();
    Agent response = agentsClient.setAgent(agent);
  }

  Note: close() needs to be called on the agentsClient object to clean up resources such as
  threads. In the example above, try-with-resources is used, which automatically calls close().

  The surface of this class includes several types of Java methods for each of the API's
  methods:


    A \"flattened\" method. With this type of method, the fields of the request type have been
        converted into function parameters. It may be the case that not all fields are available as
        parameters, and not every API method will have a flattened method entry point.
    A \"request object\" method. This type of method only takes one parameter, a request object,
        which must be constructed before the call. Not every API method will have a request object
        method.
    A \"callable\" method. This type of method takes no parameters and returns an immutable API
        callable object, which can be used to initiate calls to the service.


  See the individual methods for example code.

  Many parameters require resource names to be formatted in a particular way. To assist with
  these names, this class includes a format method for each type of name, and additionally a parse
  method to extract the individual identifiers contained within names that are returned.

  This class can be customized by passing in a custom instance of AgentsSettings to create().
  For example:

  To customize credentials:



  AgentsSettings agentsSettings =
      AgentsSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  AgentsClient agentsClient =
      AgentsClient.create(agentsSettings);

  To customize the endpoint:



  AgentsSettings agentsSettings =
      AgentsSettings.newBuilder().setEndpoint(myEndpoint).build();
  AgentsClient agentsClient =
      AgentsClient.create(agentsSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dialogflow.v2 AgentsClient]))

(defn *create
  "Constructs an instance of AgentsClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.dialogflow.v2.AgentsSettings`

  returns: `com.google.cloud.dialogflow.v2.AgentsClient`

  throws: java.io.IOException"
  (^com.google.cloud.dialogflow.v2.AgentsClient [^com.google.cloud.dialogflow.v2.AgentsSettings settings]
    (AgentsClient/create settings))
  (^com.google.cloud.dialogflow.v2.AgentsClient []
    (AgentsClient/create )))

(defn get-agent
  "Retrieves the specified agent.

   Sample code:



   try (AgentsClient agentsClient = AgentsClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     Agent response = agentsClient.getAgent(parent);
   }

  parent - Required. The project that the agent to fetch is associated with. Format: `projects/<Project ID>`. - `com.google.cloud.dialogflow.v2.ProjectName`

  returns: `com.google.cloud.dialogflow.v2.Agent`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dialogflow.v2.Agent [^AgentsClient this ^com.google.cloud.dialogflow.v2.ProjectName parent]
    (-> this (.getAgent parent))))

(defn search-agents-callable
  "Returns the list of agents.

   Since there is at most one conversational agent per project, this method is useful primarily
   for listing all agents across projects the caller has access to. One can achieve that with a
   wildcard project collection id \"-\". Refer to [List
   Sub-Collections](https://cloud.google.com/apis/design/design_patterns#list_sub-collections).

   Sample code:



   try (AgentsClient agentsClient = AgentsClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     SearchAgentsRequest request = SearchAgentsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       SearchAgentsResponse response = agentsClient.searchAgentsCallable().call(request);
       for (Agent element : response.getAgentsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.SearchAgentsRequest,com.google.cloud.dialogflow.v2.SearchAgentsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AgentsClient this]
    (-> this (.searchAgentsCallable))))

(defn search-agents-paged-callable
  "Returns the list of agents.

   Since there is at most one conversational agent per project, this method is useful primarily
   for listing all agents across projects the caller has access to. One can achieve that with a
   wildcard project collection id \"-\". Refer to [List
   Sub-Collections](https://cloud.google.com/apis/design/design_patterns#list_sub-collections).

   Sample code:



   try (AgentsClient agentsClient = AgentsClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     SearchAgentsRequest request = SearchAgentsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<SearchAgentsPagedResponse> future = agentsClient.searchAgentsPagedCallable().futureCall(request);
     // Do something
     for (Agent element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.SearchAgentsRequest,com.google.cloud.dialogflow.v2.AgentsClient$SearchAgentsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AgentsClient this]
    (-> this (.searchAgentsPagedCallable))))

(defn restore-agent-operation-callable
  "Restores the specified agent from a ZIP file.

   Replaces the current agent version with a new one. All the intents and entity types in the
   older version are deleted.

   Operation <response: [google.protobuf.Empty][google.protobuf.Empty]>

   Sample code:



   try (AgentsClient agentsClient = AgentsClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     RestoreAgentRequest request = RestoreAgentRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     OperationFuture<Empty, Struct> future = agentsClient.restoreAgentOperationCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2.RestoreAgentRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^AgentsClient this]
    (-> this (.restoreAgentOperationCallable))))

(defn restore-agent-callable
  "Restores the specified agent from a ZIP file.

   Replaces the current agent version with a new one. All the intents and entity types in the
   older version are deleted.

   Operation <response: [google.protobuf.Empty][google.protobuf.Empty]>

   Sample code:



   try (AgentsClient agentsClient = AgentsClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     RestoreAgentRequest request = RestoreAgentRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<Operation> future = agentsClient.restoreAgentCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.RestoreAgentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AgentsClient this]
    (-> this (.restoreAgentCallable))))

(defn get-agent-callable
  "Retrieves the specified agent.

   Sample code:



   try (AgentsClient agentsClient = AgentsClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     GetAgentRequest request = GetAgentRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<Agent> future = agentsClient.getAgentCallable().futureCall(request);
     // Do something
     Agent response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.GetAgentRequest,com.google.cloud.dialogflow.v2.Agent>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AgentsClient this]
    (-> this (.getAgentCallable))))

(defn export-agent-operation-callable
  "Exports the specified agent to a ZIP file.

   Operation <response:
   [ExportAgentResponse][google.cloud.dialogflow.v2.ExportAgentResponse]>

   Sample code:



   try (AgentsClient agentsClient = AgentsClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     ExportAgentRequest request = ExportAgentRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     OperationFuture<ExportAgentResponse, Struct> future = agentsClient.exportAgentOperationCallable().futureCall(request);
     // Do something
     ExportAgentResponse response = future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2.ExportAgentRequest,com.google.cloud.dialogflow.v2.ExportAgentResponse,com.google.protobuf.Struct>`"
  ([^AgentsClient this]
    (-> this (.exportAgentOperationCallable))))

(defn get-settings
  "returns: `com.google.cloud.dialogflow.v2.AgentsSettings`"
  (^com.google.cloud.dialogflow.v2.AgentsSettings [^AgentsClient this]
    (-> this (.getSettings))))

(defn train-agent-callable
  "Trains the specified agent.

   Operation <response: [google.protobuf.Empty][google.protobuf.Empty]>

   Sample code:



   try (AgentsClient agentsClient = AgentsClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     TrainAgentRequest request = TrainAgentRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<Operation> future = agentsClient.trainAgentCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.TrainAgentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AgentsClient this]
    (-> this (.trainAgentCallable))))

(defn search-agents
  "Returns the list of agents.

   Since there is at most one conversational agent per project, this method is useful primarily
   for listing all agents across projects the caller has access to. One can achieve that with a
   wildcard project collection id \"-\". Refer to [List
   Sub-Collections](https://cloud.google.com/apis/design/design_patterns#list_sub-collections).

   Sample code:



   try (AgentsClient agentsClient = AgentsClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     for (Agent element : agentsClient.searchAgents(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The project to list agents from. Format: `projects/<Project ID or '-'>`. - `com.google.cloud.dialogflow.v2.ProjectName`

  returns: `com.google.cloud.dialogflow.v2.AgentsClient$SearchAgentsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dialogflow.v2.AgentsClient$SearchAgentsPagedResponse [^AgentsClient this ^com.google.cloud.dialogflow.v2.ProjectName parent]
    (-> this (.searchAgents parent))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.dialogflow.v2.stub.AgentsStub`"
  ([^AgentsClient this]
    (-> this (.getStub))))

(defn export-agent-callable
  "Exports the specified agent to a ZIP file.

   Operation <response:
   [ExportAgentResponse][google.cloud.dialogflow.v2.ExportAgentResponse]>

   Sample code:



   try (AgentsClient agentsClient = AgentsClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     ExportAgentRequest request = ExportAgentRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<Operation> future = agentsClient.exportAgentCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.ExportAgentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AgentsClient this]
    (-> this (.exportAgentCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^AgentsClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^AgentsClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn set-agent-callable
  "Creates/updates the specified agent.

   Sample code:



   try (AgentsClient agentsClient = AgentsClient.create()) {
     Agent agent = Agent.newBuilder().build();
     SetAgentRequest request = SetAgentRequest.newBuilder()
       .setAgent(agent)
       .build();
     ApiFuture<Agent> future = agentsClient.setAgentCallable().futureCall(request);
     // Do something
     Agent response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.SetAgentRequest,com.google.cloud.dialogflow.v2.Agent>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AgentsClient this]
    (-> this (.setAgentCallable))))

(defn export-agent-async
  "Exports the specified agent to a ZIP file.

   Operation <response:
   [ExportAgentResponse][google.cloud.dialogflow.v2.ExportAgentResponse]>

   Sample code:



   try (AgentsClient agentsClient = AgentsClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     ExportAgentResponse response = agentsClient.exportAgentAsync(parent).get();
   }

  parent - Required. The project that the agent to export is associated with. Format: `projects/<Project ID>`. - `com.google.cloud.dialogflow.v2.ProjectName`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.cloud.dialogflow.v2.ExportAgentResponse,com.google.protobuf.Struct>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^AgentsClient this ^com.google.cloud.dialogflow.v2.ProjectName parent]
    (-> this (.exportAgentAsync parent))))

(defn shutdown
  ""
  ([^AgentsClient this]
    (-> this (.shutdown))))

(defn restore-agent-async
  "Restores the specified agent from a ZIP file.

   Replaces the current agent version with a new one. All the intents and entity types in the
   older version are deleted.

   Operation <response: [google.protobuf.Empty][google.protobuf.Empty]>

   Sample code:



   try (AgentsClient agentsClient = AgentsClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     RestoreAgentRequest request = RestoreAgentRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     agentsClient.restoreAgentAsync(request).get();
   }

  request - The request object containing all of the parameters for the API call. - `com.google.cloud.dialogflow.v2.RestoreAgentRequest`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.protobuf.Empty,com.google.protobuf.Struct>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^AgentsClient this ^com.google.cloud.dialogflow.v2.RestoreAgentRequest request]
    (-> this (.restoreAgentAsync request))))

(defn import-agent-operation-callable
  "Imports the specified agent from a ZIP file.

   Uploads new intents and entity types without deleting the existing ones. Intents and entity
   types with the same name are replaced with the new versions from ImportAgentRequest.

   Operation <response: [google.protobuf.Empty][google.protobuf.Empty]>

   Sample code:



   try (AgentsClient agentsClient = AgentsClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     ImportAgentRequest request = ImportAgentRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     OperationFuture<Empty, Struct> future = agentsClient.importAgentOperationCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2.ImportAgentRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^AgentsClient this]
    (-> this (.importAgentOperationCallable))))

(defn set-agent
  "Creates/updates the specified agent.

   Sample code:



   try (AgentsClient agentsClient = AgentsClient.create()) {
     Agent agent = Agent.newBuilder().build();
     Agent response = agentsClient.setAgent(agent);
   }

  agent - Required. The agent to update. - `com.google.cloud.dialogflow.v2.Agent`

  returns: `com.google.cloud.dialogflow.v2.Agent`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.dialogflow.v2.Agent [^AgentsClient this ^com.google.cloud.dialogflow.v2.Agent agent]
    (-> this (.setAgent agent))))

(defn get-operations-client
  "Returns the OperationsClient that can be used to query the status of a long-running operation
   returned by another API method call.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.longrunning.OperationsClient`"
  ([^AgentsClient this]
    (-> this (.getOperationsClient))))

(defn train-agent-async
  "Trains the specified agent.

   Operation <response: [google.protobuf.Empty][google.protobuf.Empty]>

   Sample code:



   try (AgentsClient agentsClient = AgentsClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     agentsClient.trainAgentAsync(parent).get();
   }

  parent - Required. The project that the agent to train is associated with. Format: `projects/<Project ID>`. - `com.google.cloud.dialogflow.v2.ProjectName`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.protobuf.Empty,com.google.protobuf.Struct>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^AgentsClient this ^com.google.cloud.dialogflow.v2.ProjectName parent]
    (-> this (.trainAgentAsync parent))))

(defn close
  ""
  ([^AgentsClient this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^AgentsClient this]
    (-> this (.isTerminated))))

(defn import-agent-callable
  "Imports the specified agent from a ZIP file.

   Uploads new intents and entity types without deleting the existing ones. Intents and entity
   types with the same name are replaced with the new versions from ImportAgentRequest.

   Operation <response: [google.protobuf.Empty][google.protobuf.Empty]>

   Sample code:



   try (AgentsClient agentsClient = AgentsClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     ImportAgentRequest request = ImportAgentRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<Operation> future = agentsClient.importAgentCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.ImportAgentRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AgentsClient this]
    (-> this (.importAgentCallable))))

(defn delete-agent
  "Deletes the specified agent.

   Sample code:



   try (AgentsClient agentsClient = AgentsClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     agentsClient.deleteAgent(parent);
   }

  parent - Required. The project that the agent to delete is associated with. Format: `projects/<Project ID>`. - `com.google.cloud.dialogflow.v2.ProjectName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^AgentsClient this ^com.google.cloud.dialogflow.v2.ProjectName parent]
    (-> this (.deleteAgent parent))))

(defn train-agent-operation-callable
  "Trains the specified agent.

   Operation <response: [google.protobuf.Empty][google.protobuf.Empty]>

   Sample code:



   try (AgentsClient agentsClient = AgentsClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     TrainAgentRequest request = TrainAgentRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     OperationFuture<Empty, Struct> future = agentsClient.trainAgentOperationCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `(value="The surface for use by generated code is not stable yet and may change in the future.")   com.google.api.gax.rpc.OperationCallable<com.google.cloud.dialogflow.v2.TrainAgentRequest,com.google.protobuf.Empty,com.google.protobuf.Struct>`"
  ([^AgentsClient this]
    (-> this (.trainAgentOperationCallable))))

(defn delete-agent-callable
  "Deletes the specified agent.

   Sample code:



   try (AgentsClient agentsClient = AgentsClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     DeleteAgentRequest request = DeleteAgentRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<Void> future = agentsClient.deleteAgentCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.dialogflow.v2.DeleteAgentRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AgentsClient this]
    (-> this (.deleteAgentCallable))))

(defn import-agent-async
  "Imports the specified agent from a ZIP file.

   Uploads new intents and entity types without deleting the existing ones. Intents and entity
   types with the same name are replaced with the new versions from ImportAgentRequest.

   Operation <response: [google.protobuf.Empty][google.protobuf.Empty]>

   Sample code:



   try (AgentsClient agentsClient = AgentsClient.create()) {
     ProjectName parent = ProjectName.of(\"[PROJECT]\");
     ImportAgentRequest request = ImportAgentRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     agentsClient.importAgentAsync(request).get();
   }

  request - The request object containing all of the parameters for the API call. - `com.google.cloud.dialogflow.v2.ImportAgentRequest`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")   com.google.api.gax.longrunning.OperationFuture<com.google.protobuf.Empty,com.google.protobuf.Struct>`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^AgentsClient this ^com.google.cloud.dialogflow.v2.ImportAgentRequest request]
    (-> this (.importAgentAsync request))))

(defn shutdown-now
  ""
  ([^AgentsClient this]
    (-> this (.shutdownNow))))

