(ns com.google.cloud.logging.v2.ConfigClient
  "Service Description: Service for configuring sinks used to export log entries out of Logging.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (ConfigClient configClient = ConfigClient.create()) {
    SinkName sinkName = ProjectSinkName.of(\"[PROJECT]\", \"[SINK]\");
    LogSink response = configClient.getSink(sinkName);
  }

  Note: close() needs to be called on the configClient object to clean up resources such as
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

  This class can be customized by passing in a custom instance of ConfigSettings to create().
  For example:

  To customize credentials:



  ConfigSettings configSettings =
      ConfigSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  ConfigClient configClient =
      ConfigClient.create(configSettings);

  To customize the endpoint:



  ConfigSettings configSettings =
      ConfigSettings.newBuilder().setEndpoint(myEndpoint).build();
  ConfigClient configClient =
      ConfigClient.create(configSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging.v2 ConfigClient]))

(defn *create
  "Constructs an instance of ConfigClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.logging.v2.ConfigSettings`

  returns: `com.google.cloud.logging.v2.ConfigClient`

  throws: java.io.IOException"
  (^com.google.cloud.logging.v2.ConfigClient [^com.google.cloud.logging.v2.ConfigSettings settings]
    (ConfigClient/create settings))
  (^com.google.cloud.logging.v2.ConfigClient []
    (ConfigClient/create )))

(defn update-sink-callable
  "Updates a sink. This method replaces the following fields in the existing sink with values from
   the new sink: `destination`, and `filter`. The updated sink might also have a new
   `writer_identity`; see the `unique_writer_identity` field.

   Sample code:



   try (ConfigClient configClient = ConfigClient.create()) {
     SinkName sinkName = ProjectSinkName.of(\"[PROJECT]\", \"[SINK]\");
     LogSink sink = LogSink.newBuilder().build();
     UpdateSinkRequest request = UpdateSinkRequest.newBuilder()
       .setSinkName(sinkName.toString())
       .setSink(sink)
       .build();
     ApiFuture<LogSink> future = configClient.updateSinkCallable().futureCall(request);
     // Do something
     LogSink response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.UpdateSinkRequest,com.google.logging.v2.LogSink>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ConfigClient this]
    (-> this (.updateSinkCallable))))

(defn get-exclusion
  "Gets the description of an exclusion.

   Sample code:



   try (ConfigClient configClient = ConfigClient.create()) {
     ExclusionName name = ProjectExclusionName.of(\"[PROJECT]\", \"[EXCLUSION]\");
     LogExclusion response = configClient.getExclusion(name);
   }

  name - Required. The resource name of an existing exclusion: \"projects/[PROJECT_ID]/exclusions/[EXCLUSION_ID]\" \"organizations/[ORGANIZATION_ID]/exclusions/[EXCLUSION_ID]\" \"billingAccounts/[BILLING_ACCOUNT_ID]/exclusions/[EXCLUSION_ID]\" \"folders/[FOLDER_ID]/exclusions/[EXCLUSION_ID]\" Example: `\"projects/my-project-id/exclusions/my-exclusion-id\"`. - `com.google.logging.v2.ExclusionName`

  returns: `com.google.logging.v2.LogExclusion`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.logging.v2.LogExclusion [^ConfigClient this ^com.google.logging.v2.ExclusionName name]
    (-> this (.getExclusion name))))

(defn list-exclusions
  "Lists all the exclusions in a parent resource.

   Sample code:



   try (ConfigClient configClient = ConfigClient.create()) {
     ParentName parent = ProjectName.of(\"[PROJECT]\");
     for (LogExclusion element : configClient.listExclusions(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The parent resource whose exclusions are to be listed. \"projects/[PROJECT_ID]\" \"organizations/[ORGANIZATION_ID]\" \"billingAccounts/[BILLING_ACCOUNT_ID]\" \"folders/[FOLDER_ID]\" - `com.google.logging.v2.ParentName`

  returns: `com.google.cloud.logging.v2.ConfigClient$ListExclusionsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.logging.v2.ConfigClient$ListExclusionsPagedResponse [^ConfigClient this ^com.google.logging.v2.ParentName parent]
    (-> this (.listExclusions parent))))

(defn get-settings
  "returns: `com.google.cloud.logging.v2.ConfigSettings`"
  (^com.google.cloud.logging.v2.ConfigSettings [^ConfigClient this]
    (-> this (.getSettings))))

(defn update-exclusion
  "Changes one or more properties of an existing exclusion.

   Sample code:



   try (ConfigClient configClient = ConfigClient.create()) {
     ExclusionName name = ProjectExclusionName.of(\"[PROJECT]\", \"[EXCLUSION]\");
     LogExclusion exclusion = LogExclusion.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     LogExclusion response = configClient.updateExclusion(name, exclusion, updateMask);
   }

  name - Required. The resource name of the exclusion to update: \"projects/[PROJECT_ID]/exclusions/[EXCLUSION_ID]\" \"organizations/[ORGANIZATION_ID]/exclusions/[EXCLUSION_ID]\" \"billingAccounts/[BILLING_ACCOUNT_ID]/exclusions/[EXCLUSION_ID]\" \"folders/[FOLDER_ID]/exclusions/[EXCLUSION_ID]\" Example: `\"projects/my-project-id/exclusions/my-exclusion-id\"`. - `com.google.logging.v2.ExclusionName`
  exclusion - Required. New values for the existing exclusion. Only the fields specified in `update_mask` are relevant. - `com.google.logging.v2.LogExclusion`
  update-mask - Required. A nonempty list of fields to change in the existing exclusion. New values for the fields are taken from the corresponding fields in the [LogExclusion][google.logging.v2.LogExclusion] included in this request. Fields not mentioned in `update_mask` are not changed and are ignored in the request. For example, to change the filter and description of an exclusion, specify an `update_mask` of `\"filter,description\"`. - `com.google.protobuf.FieldMask`

  returns: `com.google.logging.v2.LogExclusion`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.logging.v2.LogExclusion [^ConfigClient this ^com.google.logging.v2.ExclusionName name ^com.google.logging.v2.LogExclusion exclusion ^com.google.protobuf.FieldMask update-mask]
    (-> this (.updateExclusion name exclusion update-mask)))
  (^com.google.logging.v2.LogExclusion [^ConfigClient this ^com.google.logging.v2.UpdateExclusionRequest request]
    (-> this (.updateExclusion request))))

(defn update-sink
  "Updates a sink. This method replaces the following fields in the existing sink with values from
   the new sink: `destination`, and `filter`. The updated sink might also have a new
   `writer_identity`; see the `unique_writer_identity` field.

   Sample code:



   try (ConfigClient configClient = ConfigClient.create()) {
     SinkName sinkName = ProjectSinkName.of(\"[PROJECT]\", \"[SINK]\");
     LogSink sink = LogSink.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     LogSink response = configClient.updateSink(sinkName, sink, updateMask);
   }

  sink-name - Required. The full resource name of the sink to update, including the parent resource and the sink identifier: \"projects/[PROJECT_ID]/sinks/[SINK_ID]\" \"organizations/[ORGANIZATION_ID]/sinks/[SINK_ID]\" \"billingAccounts/[BILLING_ACCOUNT_ID]/sinks/[SINK_ID]\" \"folders/[FOLDER_ID]/sinks/[SINK_ID]\" Example: `\"projects/my-project-id/sinks/my-sink-id\"`. - `com.google.logging.v2.SinkName`
  sink - Required. The updated sink, whose name is the same identifier that appears as part of `sink_name`. - `com.google.logging.v2.LogSink`
  update-mask - Optional. Field mask that specifies the fields in `sink` that need an update. A sink field will be overwritten if, and only if, it is in the update mask. `name` and output only fields cannot be updated. An empty updateMask is temporarily treated as using the following mask for backwards compatibility purposes: destination,filter,includeChildren At some point in the future, behavior will be removed and specifying an empty updateMask will be an error. For a detailed `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#google.protobuf.FieldMask Example: `updateMask=filter`. - `com.google.protobuf.FieldMask`

  returns: `com.google.logging.v2.LogSink`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.logging.v2.LogSink [^ConfigClient this ^com.google.logging.v2.SinkName sink-name ^com.google.logging.v2.LogSink sink ^com.google.protobuf.FieldMask update-mask]
    (-> this (.updateSink sink-name sink update-mask)))
  (^com.google.logging.v2.LogSink [^ConfigClient this ^com.google.logging.v2.SinkName sink-name ^com.google.logging.v2.LogSink sink]
    (-> this (.updateSink sink-name sink)))
  (^com.google.logging.v2.LogSink [^ConfigClient this ^com.google.logging.v2.UpdateSinkRequest request]
    (-> this (.updateSink request))))

(defn list-exclusions-callable
  "Lists all the exclusions in a parent resource.

   Sample code:



   try (ConfigClient configClient = ConfigClient.create()) {
     ParentName parent = ProjectName.of(\"[PROJECT]\");
     ListExclusionsRequest request = ListExclusionsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListExclusionsResponse response = configClient.listExclusionsCallable().call(request);
       for (LogExclusion element : response.getExclusionsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.ListExclusionsRequest,com.google.logging.v2.ListExclusionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ConfigClient this]
    (-> this (.listExclusionsCallable))))

(defn delete-exclusion-callable
  "Deletes an exclusion.

   Sample code:



   try (ConfigClient configClient = ConfigClient.create()) {
     ExclusionName name = ProjectExclusionName.of(\"[PROJECT]\", \"[EXCLUSION]\");
     DeleteExclusionRequest request = DeleteExclusionRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = configClient.deleteExclusionCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.DeleteExclusionRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ConfigClient this]
    (-> this (.deleteExclusionCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.logging.v2.stub.ConfigServiceV2Stub`"
  ([^ConfigClient this]
    (-> this (.getStub))))

(defn list-sinks-paged-callable
  "Lists sinks.

   Sample code:



   try (ConfigClient configClient = ConfigClient.create()) {
     ParentName parent = ProjectName.of(\"[PROJECT]\");
     ListSinksRequest request = ListSinksRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListSinksPagedResponse> future = configClient.listSinksPagedCallable().futureCall(request);
     // Do something
     for (LogSink element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.ListSinksRequest,com.google.cloud.logging.v2.ConfigClient$ListSinksPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ConfigClient this]
    (-> this (.listSinksPagedCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^ConfigClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^ConfigClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn list-sinks
  "Lists sinks.

   Sample code:



   try (ConfigClient configClient = ConfigClient.create()) {
     ParentName parent = ProjectName.of(\"[PROJECT]\");
     for (LogSink element : configClient.listSinks(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The parent resource whose sinks are to be listed: \"projects/[PROJECT_ID]\" \"organizations/[ORGANIZATION_ID]\" \"billingAccounts/[BILLING_ACCOUNT_ID]\" \"folders/[FOLDER_ID]\" - `com.google.logging.v2.ParentName`

  returns: `com.google.cloud.logging.v2.ConfigClient$ListSinksPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.logging.v2.ConfigClient$ListSinksPagedResponse [^ConfigClient this ^com.google.logging.v2.ParentName parent]
    (-> this (.listSinks parent))))

(defn shutdown
  ""
  ([^ConfigClient this]
    (-> this (.shutdown))))

(defn create-exclusion-callable
  "Creates a new exclusion in a specified parent resource. Only log entries belonging to that
   resource can be excluded. You can have up to 10 exclusions in a resource.

   Sample code:



   try (ConfigClient configClient = ConfigClient.create()) {
     ParentName parent = ProjectName.of(\"[PROJECT]\");
     LogExclusion exclusion = LogExclusion.newBuilder().build();
     CreateExclusionRequest request = CreateExclusionRequest.newBuilder()
       .setParent(parent.toString())
       .setExclusion(exclusion)
       .build();
     ApiFuture<LogExclusion> future = configClient.createExclusionCallable().futureCall(request);
     // Do something
     LogExclusion response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.CreateExclusionRequest,com.google.logging.v2.LogExclusion>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ConfigClient this]
    (-> this (.createExclusionCallable))))

(defn get-exclusion-callable
  "Gets the description of an exclusion.

   Sample code:



   try (ConfigClient configClient = ConfigClient.create()) {
     ExclusionName name = ProjectExclusionName.of(\"[PROJECT]\", \"[EXCLUSION]\");
     GetExclusionRequest request = GetExclusionRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<LogExclusion> future = configClient.getExclusionCallable().futureCall(request);
     // Do something
     LogExclusion response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.GetExclusionRequest,com.google.logging.v2.LogExclusion>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ConfigClient this]
    (-> this (.getExclusionCallable))))

(defn delete-exclusion
  "Deletes an exclusion.

   Sample code:



   try (ConfigClient configClient = ConfigClient.create()) {
     ExclusionName name = ProjectExclusionName.of(\"[PROJECT]\", \"[EXCLUSION]\");
     configClient.deleteExclusion(name);
   }

  name - Required. The resource name of an existing exclusion to delete: \"projects/[PROJECT_ID]/exclusions/[EXCLUSION_ID]\" \"organizations/[ORGANIZATION_ID]/exclusions/[EXCLUSION_ID]\" \"billingAccounts/[BILLING_ACCOUNT_ID]/exclusions/[EXCLUSION_ID]\" \"folders/[FOLDER_ID]/exclusions/[EXCLUSION_ID]\" Example: `\"projects/my-project-id/exclusions/my-exclusion-id\"`. - `com.google.logging.v2.ExclusionName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^ConfigClient this ^com.google.logging.v2.ExclusionName name]
    (-> this (.deleteExclusion name))))

(defn close
  ""
  ([^ConfigClient this]
    (-> this (.close))))

(defn create-sink-callable
  "Creates a sink that exports specified log entries to a destination. The export of
   newly-ingested log entries begins immediately, unless the sink's `writer_identity` is not
   permitted to write to the destination. A sink can export log entries only from the resource
   owning the sink.

   Sample code:



   try (ConfigClient configClient = ConfigClient.create()) {
     ParentName parent = ProjectName.of(\"[PROJECT]\");
     LogSink sink = LogSink.newBuilder().build();
     CreateSinkRequest request = CreateSinkRequest.newBuilder()
       .setParent(parent.toString())
       .setSink(sink)
       .build();
     ApiFuture<LogSink> future = configClient.createSinkCallable().futureCall(request);
     // Do something
     LogSink response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.CreateSinkRequest,com.google.logging.v2.LogSink>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ConfigClient this]
    (-> this (.createSinkCallable))))

(defn get-sink-callable
  "Gets a sink.

   Sample code:



   try (ConfigClient configClient = ConfigClient.create()) {
     SinkName sinkName = ProjectSinkName.of(\"[PROJECT]\", \"[SINK]\");
     GetSinkRequest request = GetSinkRequest.newBuilder()
       .setSinkName(sinkName.toString())
       .build();
     ApiFuture<LogSink> future = configClient.getSinkCallable().futureCall(request);
     // Do something
     LogSink response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.GetSinkRequest,com.google.logging.v2.LogSink>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ConfigClient this]
    (-> this (.getSinkCallable))))

(defn list-sinks-callable
  "Lists sinks.

   Sample code:



   try (ConfigClient configClient = ConfigClient.create()) {
     ParentName parent = ProjectName.of(\"[PROJECT]\");
     ListSinksRequest request = ListSinksRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListSinksResponse response = configClient.listSinksCallable().call(request);
       for (LogSink element : response.getSinksList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.ListSinksRequest,com.google.logging.v2.ListSinksResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ConfigClient this]
    (-> this (.listSinksCallable))))

(defn update-exclusion-callable
  "Changes one or more properties of an existing exclusion.

   Sample code:



   try (ConfigClient configClient = ConfigClient.create()) {
     ExclusionName name = ProjectExclusionName.of(\"[PROJECT]\", \"[EXCLUSION]\");
     LogExclusion exclusion = LogExclusion.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     UpdateExclusionRequest request = UpdateExclusionRequest.newBuilder()
       .setName(name.toString())
       .setExclusion(exclusion)
       .setUpdateMask(updateMask)
       .build();
     ApiFuture<LogExclusion> future = configClient.updateExclusionCallable().futureCall(request);
     // Do something
     LogExclusion response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.UpdateExclusionRequest,com.google.logging.v2.LogExclusion>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ConfigClient this]
    (-> this (.updateExclusionCallable))))

(defn create-exclusion
  "Creates a new exclusion in a specified parent resource. Only log entries belonging to that
   resource can be excluded. You can have up to 10 exclusions in a resource.

   Sample code:



   try (ConfigClient configClient = ConfigClient.create()) {
     ParentName parent = ProjectName.of(\"[PROJECT]\");
     LogExclusion exclusion = LogExclusion.newBuilder().build();
     LogExclusion response = configClient.createExclusion(parent, exclusion);
   }

  parent - Required. The parent resource in which to create the exclusion: \"projects/[PROJECT_ID]\" \"organizations/[ORGANIZATION_ID]\" \"billingAccounts/[BILLING_ACCOUNT_ID]\" \"folders/[FOLDER_ID]\" Examples: `\"projects/my-logging-project\"`, `\"organizations/123456789\"`. - `com.google.logging.v2.ParentName`
  exclusion - Required. The new exclusion, whose `name` parameter is an exclusion name that is not already used in the parent resource. - `com.google.logging.v2.LogExclusion`

  returns: `com.google.logging.v2.LogExclusion`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.logging.v2.LogExclusion [^ConfigClient this ^com.google.logging.v2.ParentName parent ^com.google.logging.v2.LogExclusion exclusion]
    (-> this (.createExclusion parent exclusion)))
  (^com.google.logging.v2.LogExclusion [^ConfigClient this ^com.google.logging.v2.CreateExclusionRequest request]
    (-> this (.createExclusion request))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^ConfigClient this]
    (-> this (.isTerminated))))

(defn get-sink
  "Gets a sink.

   Sample code:



   try (ConfigClient configClient = ConfigClient.create()) {
     SinkName sinkName = ProjectSinkName.of(\"[PROJECT]\", \"[SINK]\");
     LogSink response = configClient.getSink(sinkName);
   }

  sink-name - Required. The resource name of the sink: \"projects/[PROJECT_ID]/sinks/[SINK_ID]\" \"organizations/[ORGANIZATION_ID]/sinks/[SINK_ID]\" \"billingAccounts/[BILLING_ACCOUNT_ID]/sinks/[SINK_ID]\" \"folders/[FOLDER_ID]/sinks/[SINK_ID]\" Example: `\"projects/my-project-id/sinks/my-sink-id\"`. - `com.google.logging.v2.SinkName`

  returns: `com.google.logging.v2.LogSink`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.logging.v2.LogSink [^ConfigClient this ^com.google.logging.v2.SinkName sink-name]
    (-> this (.getSink sink-name))))

(defn delete-sink-callable
  "Deletes a sink. If the sink has a unique `writer_identity`, then that service account is also
   deleted.

   Sample code:



   try (ConfigClient configClient = ConfigClient.create()) {
     SinkName sinkName = ProjectSinkName.of(\"[PROJECT]\", \"[SINK]\");
     DeleteSinkRequest request = DeleteSinkRequest.newBuilder()
       .setSinkName(sinkName.toString())
       .build();
     ApiFuture<Void> future = configClient.deleteSinkCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.DeleteSinkRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ConfigClient this]
    (-> this (.deleteSinkCallable))))

(defn shutdown-now
  ""
  ([^ConfigClient this]
    (-> this (.shutdownNow))))

(defn delete-sink
  "Deletes a sink. If the sink has a unique `writer_identity`, then that service account is also
   deleted.

   Sample code:



   try (ConfigClient configClient = ConfigClient.create()) {
     SinkName sinkName = ProjectSinkName.of(\"[PROJECT]\", \"[SINK]\");
     configClient.deleteSink(sinkName);
   }

  sink-name - Required. The full resource name of the sink to delete, including the parent resource and the sink identifier: \"projects/[PROJECT_ID]/sinks/[SINK_ID]\" \"organizations/[ORGANIZATION_ID]/sinks/[SINK_ID]\" \"billingAccounts/[BILLING_ACCOUNT_ID]/sinks/[SINK_ID]\" \"folders/[FOLDER_ID]/sinks/[SINK_ID]\" Example: `\"projects/my-project-id/sinks/my-sink-id\"`. - `com.google.logging.v2.SinkName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^ConfigClient this ^com.google.logging.v2.SinkName sink-name]
    (-> this (.deleteSink sink-name))))

(defn create-sink
  "Creates a sink that exports specified log entries to a destination. The export of
   newly-ingested log entries begins immediately, unless the sink's `writer_identity` is not
   permitted to write to the destination. A sink can export log entries only from the resource
   owning the sink.

   Sample code:



   try (ConfigClient configClient = ConfigClient.create()) {
     ParentName parent = ProjectName.of(\"[PROJECT]\");
     LogSink sink = LogSink.newBuilder().build();
     LogSink response = configClient.createSink(parent, sink);
   }

  parent - Required. The resource in which to create the sink: \"projects/[PROJECT_ID]\" \"organizations/[ORGANIZATION_ID]\" \"billingAccounts/[BILLING_ACCOUNT_ID]\" \"folders/[FOLDER_ID]\" Examples: `\"projects/my-logging-project\"`, `\"organizations/123456789\"`. - `com.google.logging.v2.ParentName`
  sink - Required. The new sink, whose `name` parameter is a sink identifier that is not already in use. - `com.google.logging.v2.LogSink`

  returns: `com.google.logging.v2.LogSink`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.logging.v2.LogSink [^ConfigClient this ^com.google.logging.v2.ParentName parent ^com.google.logging.v2.LogSink sink]
    (-> this (.createSink parent sink)))
  (^com.google.logging.v2.LogSink [^ConfigClient this ^com.google.logging.v2.CreateSinkRequest request]
    (-> this (.createSink request))))

(defn list-exclusions-paged-callable
  "Lists all the exclusions in a parent resource.

   Sample code:



   try (ConfigClient configClient = ConfigClient.create()) {
     ParentName parent = ProjectName.of(\"[PROJECT]\");
     ListExclusionsRequest request = ListExclusionsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListExclusionsPagedResponse> future = configClient.listExclusionsPagedCallable().futureCall(request);
     // Do something
     for (LogExclusion element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.ListExclusionsRequest,com.google.cloud.logging.v2.ConfigClient$ListExclusionsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ConfigClient this]
    (-> this (.listExclusionsPagedCallable))))

