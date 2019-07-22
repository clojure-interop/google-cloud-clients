(ns com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient
  "Service Description: The Google BigQuery Data Transfer Service API enables BigQuery users to
  configure the transfer of their data from other Google Products into BigQuery. This service
  contains methods that are end user exposed. It backs up the frontend.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (DataTransferServiceClient dataTransferServiceClient = DataTransferServiceClient.create()) {
    DataSourceName name = ProjectDataSourceName.of(\"[PROJECT]\", \"[DATA_SOURCE]\");
    DataSource response = dataTransferServiceClient.getDataSource(name);
  }

  Note: close() needs to be called on the dataTransferServiceClient object to clean up resources
  such as threads. In the example above, try-with-resources is used, which automatically calls
  close().

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

  This class can be customized by passing in a custom instance of DataTransferServiceSettings to
  create(). For example:

  To customize credentials:



  DataTransferServiceSettings dataTransferServiceSettings =
      DataTransferServiceSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  DataTransferServiceClient dataTransferServiceClient =
      DataTransferServiceClient.create(dataTransferServiceSettings);

  To customize the endpoint:



  DataTransferServiceSettings dataTransferServiceSettings =
      DataTransferServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
  DataTransferServiceClient dataTransferServiceClient =
      DataTransferServiceClient.create(dataTransferServiceSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery.datatransfer.v1 DataTransferServiceClient]))

(defn *create
  "Constructs an instance of DataTransferServiceClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceSettings`

  returns: `com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient`

  throws: java.io.IOException"
  (^com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient [^com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceSettings settings]
    (DataTransferServiceClient/create settings))
  (^com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient []
    (DataTransferServiceClient/create )))

(defn delete-transfer-run-callable
  "Deletes the specified transfer run.

   Sample code:



   try (DataTransferServiceClient dataTransferServiceClient = DataTransferServiceClient.create()) {
     RunName name = ProjectRunName.of(\"[PROJECT]\", \"[TRANSFER_CONFIG]\", \"[RUN]\");
     DeleteTransferRunRequest request = DeleteTransferRunRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = dataTransferServiceClient.deleteTransferRunCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataTransferServiceClient this]
    (-> this (.deleteTransferRunCallable))))

(defn list-transfer-logs
  "Returns user facing log messages for the data transfer run.

   Sample code:



   try (DataTransferServiceClient dataTransferServiceClient = DataTransferServiceClient.create()) {
     RunName parent = ProjectRunName.of(\"[PROJECT]\", \"[TRANSFER_CONFIG]\", \"[RUN]\");
     for (TransferMessage element : dataTransferServiceClient.listTransferLogs(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Transfer run name in the form: `projects/{project_id}/transferConfigs/{config_Id}/runs/{run_id}`. - `com.google.cloud.bigquery.datatransfer.v1.RunName`

  returns: `com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListTransferLogsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListTransferLogsPagedResponse [^DataTransferServiceClient this ^com.google.cloud.bigquery.datatransfer.v1.RunName parent]
    (-> this (.listTransferLogs parent))))

(defn list-transfer-logs-paged-callable
  "Returns user facing log messages for the data transfer run.

   Sample code:



   try (DataTransferServiceClient dataTransferServiceClient = DataTransferServiceClient.create()) {
     RunName parent = ProjectRunName.of(\"[PROJECT]\", \"[TRANSFER_CONFIG]\", \"[RUN]\");
     ListTransferLogsRequest request = ListTransferLogsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListTransferLogsPagedResponse> future = dataTransferServiceClient.listTransferLogsPagedCallable().futureCall(request);
     // Do something
     for (TransferMessage element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsRequest,com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListTransferLogsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataTransferServiceClient this]
    (-> this (.listTransferLogsPagedCallable))))

(defn list-transfer-runs
  "Returns information about running and completed jobs.

   Sample code:



   try (DataTransferServiceClient dataTransferServiceClient = DataTransferServiceClient.create()) {
     TransferConfigName parent = ProjectTransferConfigName.of(\"[PROJECT]\", \"[TRANSFER_CONFIG]\");
     for (TransferRun element : dataTransferServiceClient.listTransferRuns(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Name of transfer configuration for which transfer runs should be retrieved. Format of transfer configuration resource name is: `projects/{project_id}/transferConfigs/{config_id}`. - `com.google.cloud.bigquery.datatransfer.v1.TransferConfigName`

  returns: `com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListTransferRunsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListTransferRunsPagedResponse [^DataTransferServiceClient this ^com.google.cloud.bigquery.datatransfer.v1.TransferConfigName parent]
    (-> this (.listTransferRuns parent))))

(defn schedule-transfer-runs
  "Creates transfer runs for a time range [start_time, end_time]. For each date - or whatever
   granularity the data source supports - in the range, one transfer run is created. Note that
   runs are created per UTC time in the time range. DEPRECATED: use StartManualTransferRuns
   instead.

   Sample code:



   try (DataTransferServiceClient dataTransferServiceClient = DataTransferServiceClient.create()) {
     TransferConfigName parent = ProjectTransferConfigName.of(\"[PROJECT]\", \"[TRANSFER_CONFIG]\");
     Timestamp startTime = Timestamp.newBuilder().build();
     Timestamp endTime = Timestamp.newBuilder().build();
     ScheduleTransferRunsResponse response = dataTransferServiceClient.scheduleTransferRuns(parent, startTime, endTime);
   }

  parent - Transfer configuration name in the form: `projects/{project_id}/transferConfigs/{config_id}`. - `com.google.cloud.bigquery.datatransfer.v1.TransferConfigName`
  start-time - Start time of the range of transfer runs. For example, `\"2017-05-25T00:00:00+00:00\"`. - `com.google.protobuf.Timestamp`
  end-time - End time of the range of transfer runs. For example, `\"2017-05-30T00:00:00+00:00\"`. - `com.google.protobuf.Timestamp`

  returns: `com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse [^DataTransferServiceClient this ^com.google.cloud.bigquery.datatransfer.v1.TransferConfigName parent ^com.google.protobuf.Timestamp start-time ^com.google.protobuf.Timestamp end-time]
    (-> this (.scheduleTransferRuns parent start-time end-time)))
  (^com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse [^DataTransferServiceClient this ^com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsRequest request]
    (-> this (.scheduleTransferRuns request))))

(defn list-transfer-configs-callable
  "Returns information about all data transfers in the project.

   Sample code:



   try (DataTransferServiceClient dataTransferServiceClient = DataTransferServiceClient.create()) {
     ParentName parent = ProjectName.of(\"[PROJECT]\");
     ListTransferConfigsRequest request = ListTransferConfigsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListTransferConfigsResponse response = dataTransferServiceClient.listTransferConfigsCallable().call(request);
       for (TransferConfig element : response.getTransferConfigsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest,com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataTransferServiceClient this]
    (-> this (.listTransferConfigsCallable))))

(defn list-data-sources-paged-callable
  "Lists supported data sources and returns their settings, which can be used for UI rendering.

   Sample code:



   try (DataTransferServiceClient dataTransferServiceClient = DataTransferServiceClient.create()) {
     ParentName parent = ProjectName.of(\"[PROJECT]\");
     ListDataSourcesRequest request = ListDataSourcesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListDataSourcesPagedResponse> future = dataTransferServiceClient.listDataSourcesPagedCallable().futureCall(request);
     // Do something
     for (DataSource element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesRequest,com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListDataSourcesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataTransferServiceClient this]
    (-> this (.listDataSourcesPagedCallable))))

(defn list-transfer-configs
  "Returns information about all data transfers in the project.

   Sample code:



   try (DataTransferServiceClient dataTransferServiceClient = DataTransferServiceClient.create()) {
     ParentName parent = ProjectName.of(\"[PROJECT]\");
     for (TransferConfig element : dataTransferServiceClient.listTransferConfigs(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - The BigQuery project id for which data sources should be returned: `projects/{project_id}`. - `com.google.cloud.bigquery.datatransfer.v1.ParentName`

  returns: `com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListTransferConfigsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListTransferConfigsPagedResponse [^DataTransferServiceClient this ^com.google.cloud.bigquery.datatransfer.v1.ParentName parent]
    (-> this (.listTransferConfigs parent))))

(defn get-settings
  "returns: `com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceSettings`"
  (^com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceSettings [^DataTransferServiceClient this]
    (-> this (.getSettings))))

(defn list-data-sources
  "Lists supported data sources and returns their settings, which can be used for UI rendering.

   Sample code:



   try (DataTransferServiceClient dataTransferServiceClient = DataTransferServiceClient.create()) {
     ParentName parent = ProjectName.of(\"[PROJECT]\");
     for (DataSource element : dataTransferServiceClient.listDataSources(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - The BigQuery project id for which data sources should be returned. Must be in the form: `projects/{project_id}` - `com.google.cloud.bigquery.datatransfer.v1.ParentName`

  returns: `com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListDataSourcesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListDataSourcesPagedResponse [^DataTransferServiceClient this ^com.google.cloud.bigquery.datatransfer.v1.ParentName parent]
    (-> this (.listDataSources parent))))

(defn schedule-transfer-runs-callable
  "Creates transfer runs for a time range [start_time, end_time]. For each date - or whatever
   granularity the data source supports - in the range, one transfer run is created. Note that
   runs are created per UTC time in the time range. DEPRECATED: use StartManualTransferRuns
   instead.

   Sample code:



   try (DataTransferServiceClient dataTransferServiceClient = DataTransferServiceClient.create()) {
     TransferConfigName parent = ProjectTransferConfigName.of(\"[PROJECT]\", \"[TRANSFER_CONFIG]\");
     Timestamp startTime = Timestamp.newBuilder().build();
     Timestamp endTime = Timestamp.newBuilder().build();
     ScheduleTransferRunsRequest request = ScheduleTransferRunsRequest.newBuilder()
       .setParent(parent.toString())
       .setStartTime(startTime)
       .setEndTime(endTime)
       .build();
     ApiFuture<ScheduleTransferRunsResponse> future = dataTransferServiceClient.scheduleTransferRunsCallable().futureCall(request);
     // Do something
     ScheduleTransferRunsResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsRequest,com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataTransferServiceClient this]
    (-> this (.scheduleTransferRunsCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.bigquery.datatransfer.v1.stub.DataTransferServiceStub`"
  ([^DataTransferServiceClient this]
    (-> this (.getStub))))

(defn list-data-sources-callable
  "Lists supported data sources and returns their settings, which can be used for UI rendering.

   Sample code:



   try (DataTransferServiceClient dataTransferServiceClient = DataTransferServiceClient.create()) {
     ParentName parent = ProjectName.of(\"[PROJECT]\");
     ListDataSourcesRequest request = ListDataSourcesRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListDataSourcesResponse response = dataTransferServiceClient.listDataSourcesCallable().call(request);
       for (DataSource element : response.getDataSourcesList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesRequest,com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataTransferServiceClient this]
    (-> this (.listDataSourcesCallable))))

(defn create-transfer-config-callable
  "Creates a new data transfer configuration.

   Sample code:



   try (DataTransferServiceClient dataTransferServiceClient = DataTransferServiceClient.create()) {
     ParentName parent = ProjectName.of(\"[PROJECT]\");
     TransferConfig transferConfig = TransferConfig.newBuilder().build();
     CreateTransferConfigRequest request = CreateTransferConfigRequest.newBuilder()
       .setParent(parent.toString())
       .setTransferConfig(transferConfig)
       .build();
     ApiFuture<TransferConfig> future = dataTransferServiceClient.createTransferConfigCallable().futureCall(request);
     // Do something
     TransferConfig response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.CreateTransferConfigRequest,com.google.cloud.bigquery.datatransfer.v1.TransferConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataTransferServiceClient this]
    (-> this (.createTransferConfigCallable))))

(defn start-manual-transfer-runs-callable
  "Start manual transfer runs to be executed now with schedule_time equal to current time. The
   transfer runs can be created for a time range where the run_time is between start_time
   (inclusive) and end_time (exclusive), or for a specific run_time.

   Sample code:



   try (DataTransferServiceClient dataTransferServiceClient = DataTransferServiceClient.create()) {
     StartManualTransferRunsRequest request = StartManualTransferRunsRequest.newBuilder().build();
     ApiFuture<StartManualTransferRunsResponse> future = dataTransferServiceClient.startManualTransferRunsCallable().futureCall(request);
     // Do something
     StartManualTransferRunsResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsRequest,com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataTransferServiceClient this]
    (-> this (.startManualTransferRunsCallable))))

(defn delete-transfer-run
  "Deletes the specified transfer run.

   Sample code:



   try (DataTransferServiceClient dataTransferServiceClient = DataTransferServiceClient.create()) {
     RunName name = ProjectRunName.of(\"[PROJECT]\", \"[TRANSFER_CONFIG]\", \"[RUN]\");
     dataTransferServiceClient.deleteTransferRun(name);
   }

  name - The field will contain name of the resource requested, for example: `projects/{project_id}/transferConfigs/{config_id}/runs/{run_id}` - `com.google.cloud.bigquery.datatransfer.v1.RunName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^DataTransferServiceClient this ^com.google.cloud.bigquery.datatransfer.v1.RunName name]
    (-> this (.deleteTransferRun name))))

(defn check-valid-creds-callable
  "Returns true if valid credentials exist for the given data source and requesting user. Some
   data sources doesn't support service account, so we need to talk to them on behalf of the end
   user. This API just checks whether we have OAuth token for the particular user, which is a
   pre-requisite before user can create a transfer config.

   Sample code:



   try (DataTransferServiceClient dataTransferServiceClient = DataTransferServiceClient.create()) {
     DataSourceName name = ProjectDataSourceName.of(\"[PROJECT]\", \"[DATA_SOURCE]\");
     CheckValidCredsRequest request = CheckValidCredsRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<CheckValidCredsResponse> future = dataTransferServiceClient.checkValidCredsCallable().futureCall(request);
     // Do something
     CheckValidCredsResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.CheckValidCredsRequest,com.google.cloud.bigquery.datatransfer.v1.CheckValidCredsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataTransferServiceClient this]
    (-> this (.checkValidCredsCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^DataTransferServiceClient this]
    (-> this (.isShutdown))))

(defn update-transfer-config
  "Updates a data transfer configuration. All fields must be set, even if they are not updated.

   Sample code:



   try (DataTransferServiceClient dataTransferServiceClient = DataTransferServiceClient.create()) {
     TransferConfig transferConfig = TransferConfig.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     TransferConfig response = dataTransferServiceClient.updateTransferConfig(transferConfig, updateMask);
   }

  transfer-config - Data transfer configuration to create. - `com.google.cloud.bigquery.datatransfer.v1.TransferConfig`
  update-mask - Required list of fields to be updated in this request. - `com.google.protobuf.FieldMask`

  returns: `com.google.cloud.bigquery.datatransfer.v1.TransferConfig`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.bigquery.datatransfer.v1.TransferConfig [^DataTransferServiceClient this ^com.google.cloud.bigquery.datatransfer.v1.TransferConfig transfer-config ^com.google.protobuf.FieldMask update-mask]
    (-> this (.updateTransferConfig transfer-config update-mask)))
  (^com.google.cloud.bigquery.datatransfer.v1.TransferConfig [^DataTransferServiceClient this ^com.google.cloud.bigquery.datatransfer.v1.UpdateTransferConfigRequest request]
    (-> this (.updateTransferConfig request))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^DataTransferServiceClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^DataTransferServiceClient this]
    (-> this (.shutdown))))

(defn get-transfer-run
  "Returns information about the particular transfer run.

   Sample code:



   try (DataTransferServiceClient dataTransferServiceClient = DataTransferServiceClient.create()) {
     RunName name = ProjectRunName.of(\"[PROJECT]\", \"[TRANSFER_CONFIG]\", \"[RUN]\");
     TransferRun response = dataTransferServiceClient.getTransferRun(name);
   }

  name - The field will contain name of the resource requested, for example: `projects/{project_id}/transferConfigs/{config_id}/runs/{run_id}` - `com.google.cloud.bigquery.datatransfer.v1.RunName`

  returns: `com.google.cloud.bigquery.datatransfer.v1.TransferRun`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.bigquery.datatransfer.v1.TransferRun [^DataTransferServiceClient this ^com.google.cloud.bigquery.datatransfer.v1.RunName name]
    (-> this (.getTransferRun name))))

(defn delete-transfer-config-callable
  "Deletes a data transfer configuration, including any associated transfer runs and logs.

   Sample code:



   try (DataTransferServiceClient dataTransferServiceClient = DataTransferServiceClient.create()) {
     TransferConfigName name = ProjectTransferConfigName.of(\"[PROJECT]\", \"[TRANSFER_CONFIG]\");
     DeleteTransferConfigRequest request = DeleteTransferConfigRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = dataTransferServiceClient.deleteTransferConfigCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.DeleteTransferConfigRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataTransferServiceClient this]
    (-> this (.deleteTransferConfigCallable))))

(defn start-manual-transfer-runs
  "Start manual transfer runs to be executed now with schedule_time equal to current time. The
   transfer runs can be created for a time range where the run_time is between start_time
   (inclusive) and end_time (exclusive), or for a specific run_time.

   Sample code:



   try (DataTransferServiceClient dataTransferServiceClient = DataTransferServiceClient.create()) {
     StartManualTransferRunsRequest request = StartManualTransferRunsRequest.newBuilder().build();
     StartManualTransferRunsResponse response = dataTransferServiceClient.startManualTransferRuns(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsRequest`

  returns: `com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse [^DataTransferServiceClient this ^com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsRequest request]
    (-> this (.startManualTransferRuns request))))

(defn get-transfer-run-callable
  "Returns information about the particular transfer run.

   Sample code:



   try (DataTransferServiceClient dataTransferServiceClient = DataTransferServiceClient.create()) {
     RunName name = ProjectRunName.of(\"[PROJECT]\", \"[TRANSFER_CONFIG]\", \"[RUN]\");
     GetTransferRunRequest request = GetTransferRunRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<TransferRun> future = dataTransferServiceClient.getTransferRunCallable().futureCall(request);
     // Do something
     TransferRun response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.GetTransferRunRequest,com.google.cloud.bigquery.datatransfer.v1.TransferRun>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataTransferServiceClient this]
    (-> this (.getTransferRunCallable))))

(defn get-transfer-config
  "Returns information about a data transfer config.

   Sample code:



   try (DataTransferServiceClient dataTransferServiceClient = DataTransferServiceClient.create()) {
     TransferConfigName name = ProjectTransferConfigName.of(\"[PROJECT]\", \"[TRANSFER_CONFIG]\");
     TransferConfig response = dataTransferServiceClient.getTransferConfig(name);
   }

  name - The field will contain name of the resource requested, for example: `projects/{project_id}/transferConfigs/{config_id}` - `com.google.cloud.bigquery.datatransfer.v1.TransferConfigName`

  returns: `com.google.cloud.bigquery.datatransfer.v1.TransferConfig`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.bigquery.datatransfer.v1.TransferConfig [^DataTransferServiceClient this ^com.google.cloud.bigquery.datatransfer.v1.TransferConfigName name]
    (-> this (.getTransferConfig name))))

(defn update-transfer-config-callable
  "Updates a data transfer configuration. All fields must be set, even if they are not updated.

   Sample code:



   try (DataTransferServiceClient dataTransferServiceClient = DataTransferServiceClient.create()) {
     TransferConfig transferConfig = TransferConfig.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     UpdateTransferConfigRequest request = UpdateTransferConfigRequest.newBuilder()
       .setTransferConfig(transferConfig)
       .setUpdateMask(updateMask)
       .build();
     ApiFuture<TransferConfig> future = dataTransferServiceClient.updateTransferConfigCallable().futureCall(request);
     // Do something
     TransferConfig response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.UpdateTransferConfigRequest,com.google.cloud.bigquery.datatransfer.v1.TransferConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataTransferServiceClient this]
    (-> this (.updateTransferConfigCallable))))

(defn list-transfer-runs-callable
  "Returns information about running and completed jobs.

   Sample code:



   try (DataTransferServiceClient dataTransferServiceClient = DataTransferServiceClient.create()) {
     TransferConfigName parent = ProjectTransferConfigName.of(\"[PROJECT]\", \"[TRANSFER_CONFIG]\");
     ListTransferRunsRequest request = ListTransferRunsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListTransferRunsResponse response = dataTransferServiceClient.listTransferRunsCallable().call(request);
       for (TransferRun element : response.getTransferRunsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsRequest,com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataTransferServiceClient this]
    (-> this (.listTransferRunsCallable))))

(defn close
  ""
  ([^DataTransferServiceClient this]
    (-> this (.close))))

(defn get-data-source-callable
  "Retrieves a supported data source and returns its settings, which can be used for UI rendering.

   Sample code:



   try (DataTransferServiceClient dataTransferServiceClient = DataTransferServiceClient.create()) {
     DataSourceName name = ProjectDataSourceName.of(\"[PROJECT]\", \"[DATA_SOURCE]\");
     GetDataSourceRequest request = GetDataSourceRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<DataSource> future = dataTransferServiceClient.getDataSourceCallable().futureCall(request);
     // Do something
     DataSource response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.GetDataSourceRequest,com.google.cloud.bigquery.datatransfer.v1.DataSource>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataTransferServiceClient this]
    (-> this (.getDataSourceCallable))))

(defn list-transfer-configs-paged-callable
  "Returns information about all data transfers in the project.

   Sample code:



   try (DataTransferServiceClient dataTransferServiceClient = DataTransferServiceClient.create()) {
     ParentName parent = ProjectName.of(\"[PROJECT]\");
     ListTransferConfigsRequest request = ListTransferConfigsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListTransferConfigsPagedResponse> future = dataTransferServiceClient.listTransferConfigsPagedCallable().futureCall(request);
     // Do something
     for (TransferConfig element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest,com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListTransferConfigsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataTransferServiceClient this]
    (-> this (.listTransferConfigsPagedCallable))))

(defn check-valid-creds
  "Returns true if valid credentials exist for the given data source and requesting user. Some
   data sources doesn't support service account, so we need to talk to them on behalf of the end
   user. This API just checks whether we have OAuth token for the particular user, which is a
   pre-requisite before user can create a transfer config.

   Sample code:



   try (DataTransferServiceClient dataTransferServiceClient = DataTransferServiceClient.create()) {
     DataSourceName name = ProjectDataSourceName.of(\"[PROJECT]\", \"[DATA_SOURCE]\");
     CheckValidCredsResponse response = dataTransferServiceClient.checkValidCreds(name);
   }

  name - The data source in the form: `projects/{project_id}/dataSources/{data_source_id}` - `com.google.cloud.bigquery.datatransfer.v1.DataSourceName`

  returns: `com.google.cloud.bigquery.datatransfer.v1.CheckValidCredsResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.bigquery.datatransfer.v1.CheckValidCredsResponse [^DataTransferServiceClient this ^com.google.cloud.bigquery.datatransfer.v1.DataSourceName name]
    (-> this (.checkValidCreds name))))

(defn get-transfer-config-callable
  "Returns information about a data transfer config.

   Sample code:



   try (DataTransferServiceClient dataTransferServiceClient = DataTransferServiceClient.create()) {
     TransferConfigName name = ProjectTransferConfigName.of(\"[PROJECT]\", \"[TRANSFER_CONFIG]\");
     GetTransferConfigRequest request = GetTransferConfigRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<TransferConfig> future = dataTransferServiceClient.getTransferConfigCallable().futureCall(request);
     // Do something
     TransferConfig response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.GetTransferConfigRequest,com.google.cloud.bigquery.datatransfer.v1.TransferConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataTransferServiceClient this]
    (-> this (.getTransferConfigCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^DataTransferServiceClient this]
    (-> this (.isTerminated))))

(defn list-transfer-runs-paged-callable
  "Returns information about running and completed jobs.

   Sample code:



   try (DataTransferServiceClient dataTransferServiceClient = DataTransferServiceClient.create()) {
     TransferConfigName parent = ProjectTransferConfigName.of(\"[PROJECT]\", \"[TRANSFER_CONFIG]\");
     ListTransferRunsRequest request = ListTransferRunsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListTransferRunsPagedResponse> future = dataTransferServiceClient.listTransferRunsPagedCallable().futureCall(request);
     // Do something
     for (TransferRun element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsRequest,com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListTransferRunsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataTransferServiceClient this]
    (-> this (.listTransferRunsPagedCallable))))

(defn delete-transfer-config
  "Deletes a data transfer configuration, including any associated transfer runs and logs.

   Sample code:



   try (DataTransferServiceClient dataTransferServiceClient = DataTransferServiceClient.create()) {
     TransferConfigName name = ProjectTransferConfigName.of(\"[PROJECT]\", \"[TRANSFER_CONFIG]\");
     dataTransferServiceClient.deleteTransferConfig(name);
   }

  name - The field will contain name of the resource requested, for example: `projects/{project_id}/transferConfigs/{config_id}` - `com.google.cloud.bigquery.datatransfer.v1.TransferConfigName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^DataTransferServiceClient this ^com.google.cloud.bigquery.datatransfer.v1.TransferConfigName name]
    (-> this (.deleteTransferConfig name))))

(defn list-transfer-logs-callable
  "Returns user facing log messages for the data transfer run.

   Sample code:



   try (DataTransferServiceClient dataTransferServiceClient = DataTransferServiceClient.create()) {
     RunName parent = ProjectRunName.of(\"[PROJECT]\", \"[TRANSFER_CONFIG]\", \"[RUN]\");
     ListTransferLogsRequest request = ListTransferLogsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListTransferLogsResponse response = dataTransferServiceClient.listTransferLogsCallable().call(request);
       for (TransferMessage element : response.getTransferMessagesList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsRequest,com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataTransferServiceClient this]
    (-> this (.listTransferLogsCallable))))

(defn shutdown-now
  ""
  ([^DataTransferServiceClient this]
    (-> this (.shutdownNow))))

(defn create-transfer-config
  "Creates a new data transfer configuration.

   Sample code:



   try (DataTransferServiceClient dataTransferServiceClient = DataTransferServiceClient.create()) {
     ParentName parent = ProjectName.of(\"[PROJECT]\");
     TransferConfig transferConfig = TransferConfig.newBuilder().build();
     TransferConfig response = dataTransferServiceClient.createTransferConfig(parent, transferConfig);
   }

  parent - The BigQuery project id where the transfer configuration should be created. Must be in the format projects/{project_id}/locations/{location_id} If specified location and location of the destination bigquery dataset do not match - the request will fail. - `com.google.cloud.bigquery.datatransfer.v1.ParentName`
  transfer-config - Data transfer configuration to create. - `com.google.cloud.bigquery.datatransfer.v1.TransferConfig`

  returns: `com.google.cloud.bigquery.datatransfer.v1.TransferConfig`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.bigquery.datatransfer.v1.TransferConfig [^DataTransferServiceClient this ^com.google.cloud.bigquery.datatransfer.v1.ParentName parent ^com.google.cloud.bigquery.datatransfer.v1.TransferConfig transfer-config]
    (-> this (.createTransferConfig parent transfer-config)))
  (^com.google.cloud.bigquery.datatransfer.v1.TransferConfig [^DataTransferServiceClient this ^com.google.cloud.bigquery.datatransfer.v1.CreateTransferConfigRequest request]
    (-> this (.createTransferConfig request))))

(defn get-data-source
  "Retrieves a supported data source and returns its settings, which can be used for UI rendering.

   Sample code:



   try (DataTransferServiceClient dataTransferServiceClient = DataTransferServiceClient.create()) {
     DataSourceName name = ProjectDataSourceName.of(\"[PROJECT]\", \"[DATA_SOURCE]\");
     DataSource response = dataTransferServiceClient.getDataSource(name);
   }

  name - The field will contain name of the resource requested, for example: `projects/{project_id}/dataSources/{data_source_id}` - `com.google.cloud.bigquery.datatransfer.v1.DataSourceName`

  returns: `com.google.cloud.bigquery.datatransfer.v1.DataSource`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.bigquery.datatransfer.v1.DataSource [^DataTransferServiceClient this ^com.google.cloud.bigquery.datatransfer.v1.DataSourceName name]
    (-> this (.getDataSource name))))

