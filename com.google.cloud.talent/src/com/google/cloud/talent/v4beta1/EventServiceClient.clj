(ns com.google.cloud.talent.v4beta1.EventServiceClient
  "Service Description: A service handles client event report.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (EventServiceClient eventServiceClient = EventServiceClient.create()) {
    TenantOrProjectName parent = TenantName.of(\"[PROJECT]\", \"[TENANT]\");
    ClientEvent clientEvent = ClientEvent.newBuilder().build();
    ClientEvent response = eventServiceClient.createClientEvent(parent, clientEvent);
  }

  Note: close() needs to be called on the eventServiceClient object to clean up resources such
  as threads. In the example above, try-with-resources is used, which automatically calls close().

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

  This class can be customized by passing in a custom instance of EventServiceSettings to
  create(). For example:

  To customize credentials:



  EventServiceSettings eventServiceSettings =
      EventServiceSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  EventServiceClient eventServiceClient =
      EventServiceClient.create(eventServiceSettings);

  To customize the endpoint:



  EventServiceSettings eventServiceSettings =
      EventServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
  EventServiceClient eventServiceClient =
      EventServiceClient.create(eventServiceSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.talent.v4beta1 EventServiceClient]))

(defn *create
  "Constructs an instance of EventServiceClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.talent.v4beta1.EventServiceSettings`

  returns: `com.google.cloud.talent.v4beta1.EventServiceClient`

  throws: java.io.IOException"
  (^com.google.cloud.talent.v4beta1.EventServiceClient [^com.google.cloud.talent.v4beta1.EventServiceSettings settings]
    (EventServiceClient/create settings))
  (^com.google.cloud.talent.v4beta1.EventServiceClient []
    (EventServiceClient/create )))

(defn get-settings
  "returns: `com.google.cloud.talent.v4beta1.EventServiceSettings`"
  (^com.google.cloud.talent.v4beta1.EventServiceSettings [^EventServiceClient this]
    (-> this (.getSettings))))

(defn create-client-event-callable
  "Report events issued when end user interacts with customer's application that uses Cloud Talent
   Solution. You may inspect the created events in [self service
   tools](https://console.cloud.google.com/talent-solution/overview). [Learn
   more](https://cloud.google.com/talent-solution/docs/management-tools) about self service tools.

   Sample code:



   try (EventServiceClient eventServiceClient = EventServiceClient.create()) {
     TenantOrProjectName parent = TenantName.of(\"[PROJECT]\", \"[TENANT]\");
     ClientEvent clientEvent = ClientEvent.newBuilder().build();
     CreateClientEventRequest request = CreateClientEventRequest.newBuilder()
       .setParent(parent.toString())
       .setClientEvent(clientEvent)
       .build();
     ApiFuture<ClientEvent> future = eventServiceClient.createClientEventCallable().futureCall(request);
     // Do something
     ClientEvent response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.talent.v4beta1.CreateClientEventRequest,com.google.cloud.talent.v4beta1.ClientEvent>`"
  (^com.google.api.gax.rpc.UnaryCallable [^EventServiceClient this]
    (-> this (.createClientEventCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.talent.v4beta1.stub.EventServiceStub`"
  ([^EventServiceClient this]
    (-> this (.getStub))))

(defn create-client-event
  "Report events issued when end user interacts with customer's application that uses Cloud Talent
   Solution. You may inspect the created events in [self service
   tools](https://console.cloud.google.com/talent-solution/overview). [Learn
   more](https://cloud.google.com/talent-solution/docs/management-tools) about self service tools.

   Sample code:



   try (EventServiceClient eventServiceClient = EventServiceClient.create()) {
     TenantOrProjectName parent = TenantName.of(\"[PROJECT]\", \"[TENANT]\");
     ClientEvent clientEvent = ClientEvent.newBuilder().build();
     ClientEvent response = eventServiceClient.createClientEvent(parent, clientEvent);
   }

  parent - Required. Resource name of the tenant under which the event is created. The format is \"projects/{project_id}/tenants/{tenant_id}\", for example, \"projects/api-test-project/tenant/foo\". Tenant id is optional and a default tenant is created if unspecified, for example, \"projects/api-test-project\". - `com.google.cloud.talent.v4beta1.TenantOrProjectName`
  client-event - Required. Events issued when end user interacts with customer's application that uses Cloud Talent Solution. - `com.google.cloud.talent.v4beta1.ClientEvent`

  returns: `com.google.cloud.talent.v4beta1.ClientEvent`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.talent.v4beta1.ClientEvent [^EventServiceClient this ^com.google.cloud.talent.v4beta1.TenantOrProjectName parent ^com.google.cloud.talent.v4beta1.ClientEvent client-event]
    (-> this (.createClientEvent parent client-event)))
  (^com.google.cloud.talent.v4beta1.ClientEvent [^EventServiceClient this ^com.google.cloud.talent.v4beta1.CreateClientEventRequest request]
    (-> this (.createClientEvent request))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^EventServiceClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^EventServiceClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^EventServiceClient this]
    (-> this (.shutdown))))

(defn close
  ""
  ([^EventServiceClient this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^EventServiceClient this]
    (-> this (.isTerminated))))

(defn shutdown-now
  ""
  ([^EventServiceClient this]
    (-> this (.shutdownNow))))

