(ns com.google.cloud.logging.v2.LoggingClient
  "Service Description: Service for ingesting and querying logs.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (LoggingClient loggingClient = LoggingClient.create()) {
    LogName logName = ProjectLogName.of(\"[PROJECT]\", \"[LOG]\");
    loggingClient.deleteLog(logName);
  }

  Note: close() needs to be called on the loggingClient object to clean up resources such as
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

  This class can be customized by passing in a custom instance of LoggingSettings to create().
  For example:

  To customize credentials:



  LoggingSettings loggingSettings =
      LoggingSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  LoggingClient loggingClient =
      LoggingClient.create(loggingSettings);

  To customize the endpoint:



  LoggingSettings loggingSettings =
      LoggingSettings.newBuilder().setEndpoint(myEndpoint).build();
  LoggingClient loggingClient =
      LoggingClient.create(loggingSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.logging.v2 LoggingClient]))

(defn *create
  "Constructs an instance of LoggingClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.logging.v2.LoggingSettings`

  returns: `com.google.cloud.logging.v2.LoggingClient`

  throws: java.io.IOException"
  (^com.google.cloud.logging.v2.LoggingClient [^com.google.cloud.logging.v2.LoggingSettings settings]
    (LoggingClient/create settings))
  (^com.google.cloud.logging.v2.LoggingClient []
    (LoggingClient/create )))

(defn write-log-entries-callable
  "Writes log entries to Logging. This API method is the only way to send log entries to Logging.
   This method is used, directly or indirectly, by the Logging agent (fluentd) and all logging
   libraries configured to use Logging. A single request may contain log entries for a maximum of
   1000 different resources (projects, organizations, billing accounts or folders)

   Sample code:



   try (LoggingClient loggingClient = LoggingClient.create()) {
     List<LogEntry> entries = new ArrayList<>();
     WriteLogEntriesRequest request = WriteLogEntriesRequest.newBuilder()
       .addAllEntries(entries)
       .build();
     ApiFuture<WriteLogEntriesResponse> future = loggingClient.writeLogEntriesCallable().futureCall(request);
     // Do something
     WriteLogEntriesResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.WriteLogEntriesRequest,com.google.logging.v2.WriteLogEntriesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LoggingClient this]
    (-> this (.writeLogEntriesCallable))))

(defn list-monitored-resource-descriptors
  "Lists the descriptors for monitored resource types used by Logging.

   Sample code:



   try (LoggingClient loggingClient = LoggingClient.create()) {
     ListMonitoredResourceDescriptorsRequest request = ListMonitoredResourceDescriptorsRequest.newBuilder().build();
     for (MonitoredResourceDescriptor element : loggingClient.listMonitoredResourceDescriptors(request).iterateAll()) {
       // doThingsWith(element);
     }
   }

  request - The request object containing all of the parameters for the API call. - `com.google.logging.v2.ListMonitoredResourceDescriptorsRequest`

  returns: `com.google.cloud.logging.v2.LoggingClient$ListMonitoredResourceDescriptorsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.logging.v2.LoggingClient$ListMonitoredResourceDescriptorsPagedResponse [^LoggingClient this ^com.google.logging.v2.ListMonitoredResourceDescriptorsRequest request]
    (-> this (.listMonitoredResourceDescriptors request))))

(defn get-settings
  "returns: `com.google.cloud.logging.v2.LoggingSettings`"
  (^com.google.cloud.logging.v2.LoggingSettings [^LoggingClient this]
    (-> this (.getSettings))))

(defn delete-log
  "Deletes all the log entries in a log. The log reappears if it receives new entries. Log entries
   written shortly before the delete operation might not be deleted.

   Sample code:



   try (LoggingClient loggingClient = LoggingClient.create()) {
     LogName logName = ProjectLogName.of(\"[PROJECT]\", \"[LOG]\");
     loggingClient.deleteLog(logName);
   }

  log-name - Required. The resource name of the log to delete: \"projects/[PROJECT_ID]/logs/[LOG_ID]\" \"organizations/[ORGANIZATION_ID]/logs/[LOG_ID]\" \"billingAccounts/[BILLING_ACCOUNT_ID]/logs/[LOG_ID]\" \"folders/[FOLDER_ID]/logs/[LOG_ID]\" `[LOG_ID]` must be URL-encoded. For example, `\"projects/my-project-id/logs/syslog\"`, `\"organizations/1234567890/logs/cloudresourcemanager.googleapis.com%2Factivity\"`. For more information about log names, see [LogEntry][google.logging.v2.LogEntry]. - `com.google.logging.v2.LogName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^LoggingClient this ^com.google.logging.v2.LogName log-name]
    (-> this (.deleteLog log-name))))

(defn write-log-entries
  "Writes log entries to Logging. This API method is the only way to send log entries to Logging.
   This method is used, directly or indirectly, by the Logging agent (fluentd) and all logging
   libraries configured to use Logging. A single request may contain log entries for a maximum of
   1000 different resources (projects, organizations, billing accounts or folders)

   Sample code:



   try (LoggingClient loggingClient = LoggingClient.create()) {
     LogName logName = ProjectLogName.of(\"[PROJECT]\", \"[LOG]\");
     MonitoredResource resource = MonitoredResource.newBuilder().build();
     Map<String, String> labels = new HashMap<>();
     List<LogEntry> entries = new ArrayList<>();
     WriteLogEntriesResponse response = loggingClient.writeLogEntries(logName, resource, labels, entries);
   }

  log-name - Optional. A default log resource name that is assigned to all log entries in `entries` that do not specify a value for `log_name`: \"projects/[PROJECT_ID]/logs/[LOG_ID]\" \"organizations/[ORGANIZATION_ID]/logs/[LOG_ID]\" \"billingAccounts/[BILLING_ACCOUNT_ID]/logs/[LOG_ID]\" \"folders/[FOLDER_ID]/logs/[LOG_ID]\" `[LOG_ID]` must be URL-encoded. For example: \"projects/my-project-id/logs/syslog\" \"organizations/1234567890/logs/cloudresourcemanager.googleapis.com%2Factivity\" The permission <code>logging.logEntries.create</code> is needed on each project, organization, billing account, or folder that is receiving new log entries, whether the resource is specified in <code>logName</code> or in an individual log entry. - `com.google.logging.v2.LogName`
  resource - Optional. A default monitored resource object that is assigned to all log entries in `entries` that do not specify a value for `resource`. Example: { \"type\": \"gce_instance\", \"labels\": { \"zone\": \"us-central1-a\", \"instance_id\": \"00000000000000000000\" }} See [LogEntry][google.logging.v2.LogEntry]. - `com.google.api.MonitoredResource`
  labels - Optional. Default labels that are added to the `labels` field of all log entries in `entries`. If a log entry already has a label with the same key as a label in this parameter, then the log entry's label is not changed. See [LogEntry][google.logging.v2.LogEntry]. - `java.util.Map`
  entries - Required. The log entries to send to Logging. The order of log entries in this list does not matter. Values supplied in this method's `log_name`, `resource`, and `labels` fields are copied into those log entries in this list that do not include values for their corresponding fields. For more information, see the [LogEntry][google.logging.v2.LogEntry] type. If the `timestamp` or `insert_id` fields are missing in log entries, then this method supplies the current time or a unique identifier, respectively. The supplied values are chosen so that, among the log entries that did not supply their own values, the entries earlier in the list will sort before the entries later in the list. See the `entries.list` method. Log entries with timestamps that are more than the [logs retention period](/logging/quota-policy) in the past or more than 24 hours in the future will not be available when calling `entries.list`. However, those log entries can still be exported with [LogSinks](/logging/docs/api/tasks/exporting-logs). To improve throughput and to avoid exceeding the [quota limit](/logging/quota-policy) for calls to `entries.write`, you should try to include several log entries in this list, rather than calling this method for each individual log entry. - `java.util.List`

  returns: `com.google.logging.v2.WriteLogEntriesResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.logging.v2.WriteLogEntriesResponse [^LoggingClient this ^com.google.logging.v2.LogName log-name ^com.google.api.MonitoredResource resource ^java.util.Map labels ^java.util.List entries]
    (-> this (.writeLogEntries log-name resource labels entries)))
  (^com.google.logging.v2.WriteLogEntriesResponse [^LoggingClient this ^com.google.logging.v2.WriteLogEntriesRequest request]
    (-> this (.writeLogEntries request))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.logging.v2.stub.LoggingServiceV2Stub`"
  ([^LoggingClient this]
    (-> this (.getStub))))

(defn list-logs-callable
  "Lists the logs in projects, organizations, folders, or billing accounts. Only logs that have
   entries are listed.

   Sample code:



   try (LoggingClient loggingClient = LoggingClient.create()) {
     ParentName parent = ProjectName.of(\"[PROJECT]\");
     ListLogsRequest request = ListLogsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     while (true) {
       ListLogsResponse response = loggingClient.listLogsCallable().call(request);
       for (String element : response.getLogNamesList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.ListLogsRequest,com.google.logging.v2.ListLogsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LoggingClient this]
    (-> this (.listLogsCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^LoggingClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^LoggingClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^LoggingClient this]
    (-> this (.shutdown))))

(defn list-log-entries-paged-callable
  "Lists log entries. Use this method to retrieve log entries from Logging. For ways to export log
   entries, see [Exporting Logs](/logging/docs/export).

   Sample code:



   try (LoggingClient loggingClient = LoggingClient.create()) {
     List<ParentName> resourceNames = new ArrayList<>();
     ListLogEntriesRequest request = ListLogEntriesRequest.newBuilder()
       .addAllResourceNames(ParentName.toStringList(resourceNames))
       .build();
     ApiFuture<ListLogEntriesPagedResponse> future = loggingClient.listLogEntriesPagedCallable().futureCall(request);
     // Do something
     for (LogEntry element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.ListLogEntriesRequest,com.google.cloud.logging.v2.LoggingClient$ListLogEntriesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LoggingClient this]
    (-> this (.listLogEntriesPagedCallable))))

(defn close
  ""
  ([^LoggingClient this]
    (-> this (.close))))

(defn delete-log-callable
  "Deletes all the log entries in a log. The log reappears if it receives new entries. Log entries
   written shortly before the delete operation might not be deleted.

   Sample code:



   try (LoggingClient loggingClient = LoggingClient.create()) {
     LogName logName = ProjectLogName.of(\"[PROJECT]\", \"[LOG]\");
     DeleteLogRequest request = DeleteLogRequest.newBuilder()
       .setLogName(logName.toString())
       .build();
     ApiFuture<Void> future = loggingClient.deleteLogCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.DeleteLogRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LoggingClient this]
    (-> this (.deleteLogCallable))))

(defn list-monitored-resource-descriptors-paged-callable
  "Lists the descriptors for monitored resource types used by Logging.

   Sample code:



   try (LoggingClient loggingClient = LoggingClient.create()) {
     ListMonitoredResourceDescriptorsRequest request = ListMonitoredResourceDescriptorsRequest.newBuilder().build();
     ApiFuture<ListMonitoredResourceDescriptorsPagedResponse> future = loggingClient.listMonitoredResourceDescriptorsPagedCallable().futureCall(request);
     // Do something
     for (MonitoredResourceDescriptor element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.ListMonitoredResourceDescriptorsRequest,com.google.cloud.logging.v2.LoggingClient$ListMonitoredResourceDescriptorsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LoggingClient this]
    (-> this (.listMonitoredResourceDescriptorsPagedCallable))))

(defn list-monitored-resource-descriptors-callable
  "Lists the descriptors for monitored resource types used by Logging.

   Sample code:



   try (LoggingClient loggingClient = LoggingClient.create()) {
     ListMonitoredResourceDescriptorsRequest request = ListMonitoredResourceDescriptorsRequest.newBuilder().build();
     while (true) {
       ListMonitoredResourceDescriptorsResponse response = loggingClient.listMonitoredResourceDescriptorsCallable().call(request);
       for (MonitoredResourceDescriptor element : response.getResourceDescriptorsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.ListMonitoredResourceDescriptorsRequest,com.google.logging.v2.ListMonitoredResourceDescriptorsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LoggingClient this]
    (-> this (.listMonitoredResourceDescriptorsCallable))))

(defn list-log-entries
  "Lists log entries. Use this method to retrieve log entries from Logging. For ways to export log
   entries, see [Exporting Logs](/logging/docs/export).

   Sample code:



   try (LoggingClient loggingClient = LoggingClient.create()) {
     List<String> formattedResourceNames = new ArrayList<>();
     String filter = \"\";
     String orderBy = \"\";
     for (LogEntry element : loggingClient.listLogEntries(formattedResourceNames, filter, orderBy).iterateAll()) {
       // doThingsWith(element);
     }
   }

  resource-names - Required. Names of one or more parent resources from which to retrieve log entries: \"projects/[PROJECT_ID]\" \"organizations/[ORGANIZATION_ID]\" \"billingAccounts/[BILLING_ACCOUNT_ID]\" \"folders/[FOLDER_ID]\" Projects listed in the `project_ids` field are added to this list. - `java.util.List`
  filter - Optional. A filter that chooses which log entries to return. See [Advanced Logs Filters](/logging/docs/view/advanced_filters). Only log entries that match the filter are returned. An empty filter matches all log entries in the resources listed in `resource_names`. Referencing a parent resource that is not listed in `resource_names` will cause the filter to return no results. The maximum length of the filter is 20000 characters. - `java.lang.String`
  order-by - Optional. How the results should be sorted. Presently, the only permitted values are `\"timestamp asc\"` (default) and `\"timestamp desc\"`. The first option returns entries in order of increasing values of `LogEntry.timestamp` (oldest first), and the second option returns entries in order of decreasing timestamps (newest first). Entries with equal timestamps are returned in order of their `insert_id` values. - `java.lang.String`

  returns: `com.google.cloud.logging.v2.LoggingClient$ListLogEntriesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.logging.v2.LoggingClient$ListLogEntriesPagedResponse [^LoggingClient this ^java.util.List resource-names ^java.lang.String filter ^java.lang.String order-by]
    (-> this (.listLogEntries resource-names filter order-by)))
  (^com.google.cloud.logging.v2.LoggingClient$ListLogEntriesPagedResponse [^LoggingClient this ^com.google.logging.v2.ListLogEntriesRequest request]
    (-> this (.listLogEntries request))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^LoggingClient this]
    (-> this (.isTerminated))))

(defn list-logs-paged-callable
  "Lists the logs in projects, organizations, folders, or billing accounts. Only logs that have
   entries are listed.

   Sample code:



   try (LoggingClient loggingClient = LoggingClient.create()) {
     ParentName parent = ProjectName.of(\"[PROJECT]\");
     ListLogsRequest request = ListLogsRequest.newBuilder()
       .setParent(parent.toString())
       .build();
     ApiFuture<ListLogsPagedResponse> future = loggingClient.listLogsPagedCallable().futureCall(request);
     // Do something
     for (String element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.ListLogsRequest,com.google.cloud.logging.v2.LoggingClient$ListLogsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LoggingClient this]
    (-> this (.listLogsPagedCallable))))

(defn list-log-entries-callable
  "Lists log entries. Use this method to retrieve log entries from Logging. For ways to export log
   entries, see [Exporting Logs](/logging/docs/export).

   Sample code:



   try (LoggingClient loggingClient = LoggingClient.create()) {
     List<ParentName> resourceNames = new ArrayList<>();
     ListLogEntriesRequest request = ListLogEntriesRequest.newBuilder()
       .addAllResourceNames(ParentName.toStringList(resourceNames))
       .build();
     while (true) {
       ListLogEntriesResponse response = loggingClient.listLogEntriesCallable().call(request);
       for (LogEntry element : response.getEntriesList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.logging.v2.ListLogEntriesRequest,com.google.logging.v2.ListLogEntriesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^LoggingClient this]
    (-> this (.listLogEntriesCallable))))

(defn shutdown-now
  ""
  ([^LoggingClient this]
    (-> this (.shutdownNow))))

(defn list-logs
  "Lists the logs in projects, organizations, folders, or billing accounts. Only logs that have
   entries are listed.

   Sample code:



   try (LoggingClient loggingClient = LoggingClient.create()) {
     ParentName parent = ProjectName.of(\"[PROJECT]\");
     for (String element : loggingClient.listLogs(parent).iterateAll()) {
       // doThingsWith(element);
     }
   }

  parent - Required. The resource name that owns the logs: \"projects/[PROJECT_ID]\" \"organizations/[ORGANIZATION_ID]\" \"billingAccounts/[BILLING_ACCOUNT_ID]\" \"folders/[FOLDER_ID]\" - `com.google.logging.v2.ParentName`

  returns: `com.google.cloud.logging.v2.LoggingClient$ListLogsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.logging.v2.LoggingClient$ListLogsPagedResponse [^LoggingClient this ^com.google.logging.v2.ParentName parent]
    (-> this (.listLogs parent))))

