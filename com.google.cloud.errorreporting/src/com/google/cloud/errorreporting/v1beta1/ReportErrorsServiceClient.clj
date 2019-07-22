(ns com.google.cloud.errorreporting.v1beta1.ReportErrorsServiceClient
  "Service Description: An API for reporting error events.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (ReportErrorsServiceClient reportErrorsServiceClient = ReportErrorsServiceClient.create()) {
    ProjectName projectName = ProjectName.of(\"[PROJECT]\");
    ReportedErrorEvent event = ReportedErrorEvent.newBuilder().build();
    ReportErrorEventResponse response = reportErrorsServiceClient.reportErrorEvent(projectName, event);
  }

  Note: close() needs to be called on the reportErrorsServiceClient object to clean up resources
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

  This class can be customized by passing in a custom instance of ReportErrorsServiceSettings to
  create(). For example:

  To customize credentials:



  ReportErrorsServiceSettings reportErrorsServiceSettings =
      ReportErrorsServiceSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  ReportErrorsServiceClient reportErrorsServiceClient =
      ReportErrorsServiceClient.create(reportErrorsServiceSettings);

  To customize the endpoint:



  ReportErrorsServiceSettings reportErrorsServiceSettings =
      ReportErrorsServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
  ReportErrorsServiceClient reportErrorsServiceClient =
      ReportErrorsServiceClient.create(reportErrorsServiceSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.errorreporting.v1beta1 ReportErrorsServiceClient]))

(defn *create
  "Constructs an instance of ReportErrorsServiceClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.errorreporting.v1beta1.ReportErrorsServiceSettings`

  returns: `com.google.cloud.errorreporting.v1beta1.ReportErrorsServiceClient`

  throws: java.io.IOException"
  (^com.google.cloud.errorreporting.v1beta1.ReportErrorsServiceClient [^com.google.cloud.errorreporting.v1beta1.ReportErrorsServiceSettings settings]
    (ReportErrorsServiceClient/create settings))
  (^com.google.cloud.errorreporting.v1beta1.ReportErrorsServiceClient []
    (ReportErrorsServiceClient/create )))

(defn get-settings
  "returns: `com.google.cloud.errorreporting.v1beta1.ReportErrorsServiceSettings`"
  (^com.google.cloud.errorreporting.v1beta1.ReportErrorsServiceSettings [^ReportErrorsServiceClient this]
    (-> this (.getSettings))))

(defn report-error-event-callable
  "Report an individual error event.

   This endpoint accepts <strong>either</strong> an OAuth token,
   <strong>or</strong> an <a
   href=\"https://support.google.com/cloud/answer/6158862\">API key</a> for authentication.
   To use an API key, append it to the URL as the value of a `key` parameter. For example:
   <pre>POST
   https://clouderrorreporting.googleapis.com/v1beta1/projects/example-project/events:report?key=123ABC456</pre>

   Sample code:



   try (ReportErrorsServiceClient reportErrorsServiceClient = ReportErrorsServiceClient.create()) {
     ProjectName projectName = ProjectName.of(\"[PROJECT]\");
     ReportedErrorEvent event = ReportedErrorEvent.newBuilder().build();
     ReportErrorEventRequest request = ReportErrorEventRequest.newBuilder()
       .setProjectName(projectName.toString())
       .setEvent(event)
       .build();
     ApiFuture<ReportErrorEventResponse> future = reportErrorsServiceClient.reportErrorEventCallable().futureCall(request);
     // Do something
     ReportErrorEventResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest,com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ReportErrorsServiceClient this]
    (-> this (.reportErrorEventCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.errorreporting.v1beta1.stub.ReportErrorsServiceStub`"
  ([^ReportErrorsServiceClient this]
    (-> this (.getStub))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^ReportErrorsServiceClient this]
    (-> this (.isShutdown))))

(defn report-error-event
  "Report an individual error event.

   This endpoint accepts <strong>either</strong> an OAuth token,
   <strong>or</strong> an <a
   href=\"https://support.google.com/cloud/answer/6158862\">API key</a> for authentication.
   To use an API key, append it to the URL as the value of a `key` parameter. For example:
   <pre>POST
   https://clouderrorreporting.googleapis.com/v1beta1/projects/example-project/events:report?key=123ABC456</pre>

   Sample code:



   try (ReportErrorsServiceClient reportErrorsServiceClient = ReportErrorsServiceClient.create()) {
     ProjectName projectName = ProjectName.of(\"[PROJECT]\");
     ReportedErrorEvent event = ReportedErrorEvent.newBuilder().build();
     ReportErrorEventResponse response = reportErrorsServiceClient.reportErrorEvent(projectName, event);
   }

  project-name - [Required] The resource name of the Google Cloud Platform project. Written as `projects/` plus the [Google Cloud Platform project ID](https://support.google.com/cloud/answer/6158840). Example: `projects/my-project-123`. - `com.google.devtools.clouderrorreporting.v1beta1.ProjectName`
  event - [Required] The error event to be reported. - `com.google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent`

  returns: `com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventResponse [^ReportErrorsServiceClient this ^com.google.devtools.clouderrorreporting.v1beta1.ProjectName project-name ^com.google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent event]
    (-> this (.reportErrorEvent project-name event)))
  (^com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventResponse [^ReportErrorsServiceClient this ^com.google.devtools.clouderrorreporting.v1beta1.ReportErrorEventRequest request]
    (-> this (.reportErrorEvent request))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^ReportErrorsServiceClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^ReportErrorsServiceClient this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^ReportErrorsServiceClient this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^ReportErrorsServiceClient this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^ReportErrorsServiceClient this]
    (-> this (.shutdownNow))))

