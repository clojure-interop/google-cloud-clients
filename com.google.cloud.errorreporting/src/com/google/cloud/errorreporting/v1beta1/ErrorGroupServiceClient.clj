(ns com.google.cloud.errorreporting.v1beta1.ErrorGroupServiceClient
  "Service Description: Service for retrieving and updating individual error groups.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (ErrorGroupServiceClient errorGroupServiceClient = ErrorGroupServiceClient.create()) {
    GroupName groupName = GroupName.of(\"[PROJECT]\", \"[GROUP]\");
    ErrorGroup response = errorGroupServiceClient.getGroup(groupName);
  }

  Note: close() needs to be called on the errorGroupServiceClient object to clean up resources
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

  This class can be customized by passing in a custom instance of ErrorGroupServiceSettings to
  create(). For example:

  To customize credentials:



  ErrorGroupServiceSettings errorGroupServiceSettings =
      ErrorGroupServiceSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  ErrorGroupServiceClient errorGroupServiceClient =
      ErrorGroupServiceClient.create(errorGroupServiceSettings);

  To customize the endpoint:



  ErrorGroupServiceSettings errorGroupServiceSettings =
      ErrorGroupServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
  ErrorGroupServiceClient errorGroupServiceClient =
      ErrorGroupServiceClient.create(errorGroupServiceSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.errorreporting.v1beta1 ErrorGroupServiceClient]))

(defn *create
  "Constructs an instance of ErrorGroupServiceClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.errorreporting.v1beta1.ErrorGroupServiceSettings`

  returns: `com.google.cloud.errorreporting.v1beta1.ErrorGroupServiceClient`

  throws: java.io.IOException"
  (^com.google.cloud.errorreporting.v1beta1.ErrorGroupServiceClient [^com.google.cloud.errorreporting.v1beta1.ErrorGroupServiceSettings settings]
    (ErrorGroupServiceClient/create settings))
  (^com.google.cloud.errorreporting.v1beta1.ErrorGroupServiceClient []
    (ErrorGroupServiceClient/create )))

(defn update-group
  "Replace the data for the specified group. Fails if the group does not exist.

   Sample code:



   try (ErrorGroupServiceClient errorGroupServiceClient = ErrorGroupServiceClient.create()) {
     ErrorGroup group = ErrorGroup.newBuilder().build();
     ErrorGroup response = errorGroupServiceClient.updateGroup(group);
   }

  group - [Required] The group which replaces the resource on the server. - `com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup`

  returns: `com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup [^ErrorGroupServiceClient this ^com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup group]
    (-> this (.updateGroup group))))

(defn get-settings
  "returns: `com.google.cloud.errorreporting.v1beta1.ErrorGroupServiceSettings`"
  (^com.google.cloud.errorreporting.v1beta1.ErrorGroupServiceSettings [^ErrorGroupServiceClient this]
    (-> this (.getSettings))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.errorreporting.v1beta1.stub.ErrorGroupServiceStub`"
  ([^ErrorGroupServiceClient this]
    (-> this (.getStub))))

(defn update-group-callable
  "Replace the data for the specified group. Fails if the group does not exist.

   Sample code:



   try (ErrorGroupServiceClient errorGroupServiceClient = ErrorGroupServiceClient.create()) {
     ErrorGroup group = ErrorGroup.newBuilder().build();
     UpdateGroupRequest request = UpdateGroupRequest.newBuilder()
       .setGroup(group)
       .build();
     ApiFuture<ErrorGroup> future = errorGroupServiceClient.updateGroupCallable().futureCall(request);
     // Do something
     ErrorGroup response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.devtools.clouderrorreporting.v1beta1.UpdateGroupRequest,com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ErrorGroupServiceClient this]
    (-> this (.updateGroupCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^ErrorGroupServiceClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^ErrorGroupServiceClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^ErrorGroupServiceClient this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^ErrorGroupServiceClient this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^ErrorGroupServiceClient this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^ErrorGroupServiceClient this]
    (-> this (.shutdownNow))))

(defn get-group-callable
  "Get the specified group.

   Sample code:



   try (ErrorGroupServiceClient errorGroupServiceClient = ErrorGroupServiceClient.create()) {
     GroupName groupName = GroupName.of(\"[PROJECT]\", \"[GROUP]\");
     GetGroupRequest request = GetGroupRequest.newBuilder()
       .setGroupName(groupName.toString())
       .build();
     ApiFuture<ErrorGroup> future = errorGroupServiceClient.getGroupCallable().futureCall(request);
     // Do something
     ErrorGroup response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.devtools.clouderrorreporting.v1beta1.GetGroupRequest,com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ErrorGroupServiceClient this]
    (-> this (.getGroupCallable))))

(defn get-group
  "Get the specified group.

   Sample code:



   try (ErrorGroupServiceClient errorGroupServiceClient = ErrorGroupServiceClient.create()) {
     GroupName groupName = GroupName.of(\"[PROJECT]\", \"[GROUP]\");
     ErrorGroup response = errorGroupServiceClient.getGroup(groupName);
   }

  group-name - [Required] The group resource name. Written as <code>projects/<var>projectID</var>/groups/<var>group_name</var></code>. Call <a href=\"/error-reporting/reference/rest/v1beta1/projects.groupStats/list\"> <code>groupStats.list</code></a> to return a list of groups belonging to this project. Example: <code>projects/my-project-123/groups/my-group</code> - `com.google.devtools.clouderrorreporting.v1beta1.GroupName`

  returns: `com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.devtools.clouderrorreporting.v1beta1.ErrorGroup [^ErrorGroupServiceClient this ^com.google.devtools.clouderrorreporting.v1beta1.GroupName group-name]
    (-> this (.getGroup group-name))))

