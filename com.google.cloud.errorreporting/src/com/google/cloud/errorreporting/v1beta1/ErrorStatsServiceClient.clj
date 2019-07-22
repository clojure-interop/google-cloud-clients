(ns com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceClient
  "Service Description: An API for retrieving and managing error statistics as well as data for
  individual events.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (ErrorStatsServiceClient errorStatsServiceClient = ErrorStatsServiceClient.create()) {
    ProjectName projectName = ProjectName.of(\"[PROJECT]\");
    DeleteEventsResponse response = errorStatsServiceClient.deleteEvents(projectName);
  }

  Note: close() needs to be called on the errorStatsServiceClient object to clean up resources
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

  This class can be customized by passing in a custom instance of ErrorStatsServiceSettings to
  create(). For example:

  To customize credentials:



  ErrorStatsServiceSettings errorStatsServiceSettings =
      ErrorStatsServiceSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  ErrorStatsServiceClient errorStatsServiceClient =
      ErrorStatsServiceClient.create(errorStatsServiceSettings);

  To customize the endpoint:



  ErrorStatsServiceSettings errorStatsServiceSettings =
      ErrorStatsServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
  ErrorStatsServiceClient errorStatsServiceClient =
      ErrorStatsServiceClient.create(errorStatsServiceSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.errorreporting.v1beta1 ErrorStatsServiceClient]))

(defn *create
  "Constructs an instance of ErrorStatsServiceClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceSettings`

  returns: `com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceClient`

  throws: java.io.IOException"
  (^com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceClient [^com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceSettings settings]
    (ErrorStatsServiceClient/create settings))
  (^com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceClient []
    (ErrorStatsServiceClient/create )))

(defn list-events-callable
  "Lists the specified events.

   Sample code:



   try (ErrorStatsServiceClient errorStatsServiceClient = ErrorStatsServiceClient.create()) {
     ProjectName projectName = ProjectName.of(\"[PROJECT]\");
     String groupId = \"\";
     ListEventsRequest request = ListEventsRequest.newBuilder()
       .setProjectName(projectName.toString())
       .setGroupId(groupId)
       .build();
     while (true) {
       ListEventsResponse response = errorStatsServiceClient.listEventsCallable().call(request);
       for (ErrorEvent element : response.getErrorEventsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.devtools.clouderrorreporting.v1beta1.ListEventsRequest,com.google.devtools.clouderrorreporting.v1beta1.ListEventsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ErrorStatsServiceClient this]
    (-> this (.listEventsCallable))))

(defn list-events-paged-callable
  "Lists the specified events.

   Sample code:



   try (ErrorStatsServiceClient errorStatsServiceClient = ErrorStatsServiceClient.create()) {
     ProjectName projectName = ProjectName.of(\"[PROJECT]\");
     String groupId = \"\";
     ListEventsRequest request = ListEventsRequest.newBuilder()
       .setProjectName(projectName.toString())
       .setGroupId(groupId)
       .build();
     ApiFuture<ListEventsPagedResponse> future = errorStatsServiceClient.listEventsPagedCallable().futureCall(request);
     // Do something
     for (ErrorEvent element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.devtools.clouderrorreporting.v1beta1.ListEventsRequest,com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceClient$ListEventsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ErrorStatsServiceClient this]
    (-> this (.listEventsPagedCallable))))

(defn list-group-stats-paged-callable
  "Lists the specified groups.

   Sample code:



   try (ErrorStatsServiceClient errorStatsServiceClient = ErrorStatsServiceClient.create()) {
     ProjectName projectName = ProjectName.of(\"[PROJECT]\");
     QueryTimeRange timeRange = QueryTimeRange.newBuilder().build();
     ListGroupStatsRequest request = ListGroupStatsRequest.newBuilder()
       .setProjectName(projectName.toString())
       .setTimeRange(timeRange)
       .build();
     ApiFuture<ListGroupStatsPagedResponse> future = errorStatsServiceClient.listGroupStatsPagedCallable().futureCall(request);
     // Do something
     for (ErrorGroupStats element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsRequest,com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceClient$ListGroupStatsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ErrorStatsServiceClient this]
    (-> this (.listGroupStatsPagedCallable))))

(defn list-group-stats-callable
  "Lists the specified groups.

   Sample code:



   try (ErrorStatsServiceClient errorStatsServiceClient = ErrorStatsServiceClient.create()) {
     ProjectName projectName = ProjectName.of(\"[PROJECT]\");
     QueryTimeRange timeRange = QueryTimeRange.newBuilder().build();
     ListGroupStatsRequest request = ListGroupStatsRequest.newBuilder()
       .setProjectName(projectName.toString())
       .setTimeRange(timeRange)
       .build();
     while (true) {
       ListGroupStatsResponse response = errorStatsServiceClient.listGroupStatsCallable().call(request);
       for (ErrorGroupStats element : response.getErrorGroupStatsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsRequest,com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ErrorStatsServiceClient this]
    (-> this (.listGroupStatsCallable))))

(defn get-settings
  "returns: `com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceSettings`"
  (^com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceSettings [^ErrorStatsServiceClient this]
    (-> this (.getSettings))))

(defn delete-events-callable
  "Deletes all error events of a given project.

   Sample code:



   try (ErrorStatsServiceClient errorStatsServiceClient = ErrorStatsServiceClient.create()) {
     ProjectName projectName = ProjectName.of(\"[PROJECT]\");
     DeleteEventsRequest request = DeleteEventsRequest.newBuilder()
       .setProjectName(projectName.toString())
       .build();
     ApiFuture<DeleteEventsResponse> future = errorStatsServiceClient.deleteEventsCallable().futureCall(request);
     // Do something
     DeleteEventsResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsRequest,com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ErrorStatsServiceClient this]
    (-> this (.deleteEventsCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.errorreporting.v1beta1.stub.ErrorStatsServiceStub`"
  ([^ErrorStatsServiceClient this]
    (-> this (.getStub))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^ErrorStatsServiceClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^ErrorStatsServiceClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn delete-events
  "Deletes all error events of a given project.

   Sample code:



   try (ErrorStatsServiceClient errorStatsServiceClient = ErrorStatsServiceClient.create()) {
     ProjectName projectName = ProjectName.of(\"[PROJECT]\");
     DeleteEventsResponse response = errorStatsServiceClient.deleteEvents(projectName);
   }

  project-name - [Required] The resource name of the Google Cloud Platform project. Written as `projects/` plus the [Google Cloud Platform project ID](https://support.google.com/cloud/answer/6158840). Example: `projects/my-project-123`. - `com.google.devtools.clouderrorreporting.v1beta1.ProjectName`

  returns: `com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.devtools.clouderrorreporting.v1beta1.DeleteEventsResponse [^ErrorStatsServiceClient this ^com.google.devtools.clouderrorreporting.v1beta1.ProjectName project-name]
    (-> this (.deleteEvents project-name))))

(defn shutdown
  ""
  ([^ErrorStatsServiceClient this]
    (-> this (.shutdown))))

(defn list-group-stats
  "Lists the specified groups.

   Sample code:



   try (ErrorStatsServiceClient errorStatsServiceClient = ErrorStatsServiceClient.create()) {
     ProjectName projectName = ProjectName.of(\"[PROJECT]\");
     QueryTimeRange timeRange = QueryTimeRange.newBuilder().build();
     for (ErrorGroupStats element : errorStatsServiceClient.listGroupStats(projectName, timeRange).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project-name - [Required] The resource name of the Google Cloud Platform project. Written as <code>projects/</code> plus the <a href=\"https://support.google.com/cloud/answer/6158840\">Google Cloud Platform project ID</a>. Example: <code>projects/my-project-123</code>. - `com.google.devtools.clouderrorreporting.v1beta1.ProjectName`
  time-range - [Optional] List data for the given time range. If not set a default time range is used. The field time_range_begin in the response will specify the beginning of this time range. Only <code>ErrorGroupStats</code> with a non-zero count in the given time range are returned, unless the request contains an explicit group_id list. If a group_id list is given, also <code>ErrorGroupStats</code> with zero occurrences are returned. - `com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange`

  returns: `com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceClient$ListGroupStatsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceClient$ListGroupStatsPagedResponse [^ErrorStatsServiceClient this ^com.google.devtools.clouderrorreporting.v1beta1.ProjectName project-name ^com.google.devtools.clouderrorreporting.v1beta1.QueryTimeRange time-range]
    (-> this (.listGroupStats project-name time-range)))
  (^com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceClient$ListGroupStatsPagedResponse [^ErrorStatsServiceClient this ^com.google.devtools.clouderrorreporting.v1beta1.ListGroupStatsRequest request]
    (-> this (.listGroupStats request))))

(defn list-events
  "Lists the specified events.

   Sample code:



   try (ErrorStatsServiceClient errorStatsServiceClient = ErrorStatsServiceClient.create()) {
     ProjectName projectName = ProjectName.of(\"[PROJECT]\");
     String groupId = \"\";
     for (ErrorEvent element : errorStatsServiceClient.listEvents(projectName, groupId).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project-name - [Required] The resource name of the Google Cloud Platform project. Written as `projects/` plus the [Google Cloud Platform project ID](https://support.google.com/cloud/answer/6158840). Example: `projects/my-project-123`. - `com.google.devtools.clouderrorreporting.v1beta1.ProjectName`
  group-id - [Required] The group for which events shall be returned. - `java.lang.String`

  returns: `com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceClient$ListEventsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceClient$ListEventsPagedResponse [^ErrorStatsServiceClient this ^com.google.devtools.clouderrorreporting.v1beta1.ProjectName project-name ^java.lang.String group-id]
    (-> this (.listEvents project-name group-id)))
  (^com.google.cloud.errorreporting.v1beta1.ErrorStatsServiceClient$ListEventsPagedResponse [^ErrorStatsServiceClient this ^com.google.devtools.clouderrorreporting.v1beta1.ListEventsRequest request]
    (-> this (.listEvents request))))

(defn close
  ""
  ([^ErrorStatsServiceClient this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^ErrorStatsServiceClient this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^ErrorStatsServiceClient this]
    (-> this (.shutdownNow))))

