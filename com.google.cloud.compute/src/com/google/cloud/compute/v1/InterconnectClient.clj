(ns com.google.cloud.compute.v1.InterconnectClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (InterconnectClient interconnectClient = InterconnectClient.create()) {
    ProjectGlobalInterconnectName interconnect = ProjectGlobalInterconnectName.of(\"[PROJECT]\", \"[INTERCONNECT]\");
    Operation response = interconnectClient.deleteInterconnect(interconnect);
  }

  Note: close() needs to be called on the interconnectClient object to clean up resources such
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

  This class can be customized by passing in a custom instance of InterconnectSettings to
  create(). For example:

  To customize credentials:



  InterconnectSettings interconnectSettings =
      InterconnectSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  InterconnectClient interconnectClient =
      InterconnectClient.create(interconnectSettings);

  To customize the endpoint:



  InterconnectSettings interconnectSettings =
      InterconnectSettings.newBuilder().setEndpoint(myEndpoint).build();
  InterconnectClient interconnectClient =
      InterconnectClient.create(interconnectSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InterconnectClient]))

(defn *create
  "Constructs an instance of InterconnectClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.InterconnectSettings`

  returns: `com.google.cloud.compute.v1.InterconnectClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.InterconnectClient [^com.google.cloud.compute.v1.InterconnectSettings settings]
    (InterconnectClient/create settings))
  (^com.google.cloud.compute.v1.InterconnectClient []
    (InterconnectClient/create )))

(defn get-diagnostics-interconnect-callable
  "Returns the interconnectDiagnostics for the specified interconnect.

   Sample code:



   try (InterconnectClient interconnectClient = InterconnectClient.create()) {
     String formattedInterconnect = ProjectGlobalInterconnectName.format(\"[PROJECT]\", \"[INTERCONNECT]\");
     GetDiagnosticsInterconnectHttpRequest request = GetDiagnosticsInterconnectHttpRequest.newBuilder()
       .setInterconnect(formattedInterconnect)
       .build();
     ApiFuture<InterconnectsGetDiagnosticsResponse> future = interconnectClient.getDiagnosticsInterconnectCallable().futureCall(request);
     // Do something
     InterconnectsGetDiagnosticsResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetDiagnosticsInterconnectHttpRequest,com.google.cloud.compute.v1.InterconnectsGetDiagnosticsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InterconnectClient this]
    (-> this (.getDiagnosticsInterconnectCallable))))

(defn insert-interconnect-callable
  "Creates a Interconnect in the specified project using the data included in the request.

   Sample code:



   try (InterconnectClient interconnectClient = InterconnectClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     Interconnect interconnectResource = Interconnect.newBuilder().build();
     InsertInterconnectHttpRequest request = InsertInterconnectHttpRequest.newBuilder()
       .setProject(formattedProject)
       .setInterconnectResource(interconnectResource)
       .build();
     ApiFuture<Operation> future = interconnectClient.insertInterconnectCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertInterconnectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InterconnectClient this]
    (-> this (.insertInterconnectCallable))))

(defn list-interconnects-paged-callable
  "Retrieves the list of interconnect available to the specified project.

   Sample code:



   try (InterconnectClient interconnectClient = InterconnectClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListInterconnectsHttpRequest request = ListInterconnectsHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<ListInterconnectsPagedResponse> future = interconnectClient.listInterconnectsPagedCallable().futureCall(request);
     // Do something
     for (Interconnect element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInterconnectsHttpRequest,com.google.cloud.compute.v1.InterconnectClient$ListInterconnectsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InterconnectClient this]
    (-> this (.listInterconnectsPagedCallable))))

(defn list-interconnects-callable
  "Retrieves the list of interconnect available to the specified project.

   Sample code:



   try (InterconnectClient interconnectClient = InterconnectClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListInterconnectsHttpRequest request = ListInterconnectsHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       InterconnectList response = interconnectClient.listInterconnectsCallable().call(request);
       for (Interconnect element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInterconnectsHttpRequest,com.google.cloud.compute.v1.InterconnectList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InterconnectClient this]
    (-> this (.listInterconnectsCallable))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.InterconnectSettings`"
  (^com.google.cloud.compute.v1.InterconnectSettings [^InterconnectClient this]
    (-> this (.getSettings))))

(defn get-interconnect
  "Returns the specified interconnect. Get a list of available interconnects by making a list()
   request.

   Sample code:



   try (InterconnectClient interconnectClient = InterconnectClient.create()) {
     ProjectGlobalInterconnectName interconnect = ProjectGlobalInterconnectName.of(\"[PROJECT]\", \"[INTERCONNECT]\");
     Interconnect response = interconnectClient.getInterconnect(interconnect);
   }

  interconnect - Name of the interconnect to return. - `com.google.cloud.compute.v1.ProjectGlobalInterconnectName`

  returns: `com.google.cloud.compute.v1.Interconnect`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Interconnect [^InterconnectClient this ^com.google.cloud.compute.v1.ProjectGlobalInterconnectName interconnect]
    (-> this (.getInterconnect interconnect))))

(defn patch-interconnect-callable
  "Updates the specified interconnect with the data included in the request. This method supports
   PATCH semantics and uses the JSON merge patch format and processing rules.

   Sample code:



   try (InterconnectClient interconnectClient = InterconnectClient.create()) {
     String formattedInterconnect = ProjectGlobalInterconnectName.format(\"[PROJECT]\", \"[INTERCONNECT]\");
     Interconnect interconnectResource = Interconnect.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     PatchInterconnectHttpRequest request = PatchInterconnectHttpRequest.newBuilder()
       .setInterconnect(formattedInterconnect)
       .setInterconnectResource(interconnectResource)
       .addAllFieldMask(fieldMask)
       .build();
     ApiFuture<Operation> future = interconnectClient.patchInterconnectCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchInterconnectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InterconnectClient this]
    (-> this (.patchInterconnectCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.InterconnectStub`"
  ([^InterconnectClient this]
    (-> this (.getStub))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^InterconnectClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^InterconnectClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn patch-interconnect
  "Updates the specified interconnect with the data included in the request. This method supports
   PATCH semantics and uses the JSON merge patch format and processing rules.

   Sample code:



   try (InterconnectClient interconnectClient = InterconnectClient.create()) {
     ProjectGlobalInterconnectName interconnect = ProjectGlobalInterconnectName.of(\"[PROJECT]\", \"[INTERCONNECT]\");
     Interconnect interconnectResource = Interconnect.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     Operation response = interconnectClient.patchInterconnect(interconnect, interconnectResource, fieldMask);
   }

  interconnect - Name of the interconnect to update. - `com.google.cloud.compute.v1.ProjectGlobalInterconnectName`
  interconnect-resource - Represents an Interconnects resource. The Interconnects resource is a dedicated connection between Google's network and your on-premises network. For more information, see the Dedicated overview page. (== resource_for v1.interconnects ==) (== resource_for beta.interconnects ==) - `com.google.cloud.compute.v1.Interconnect`
  field-mask - The fields that should be serialized (even if they have empty values). If the containing message object has a non-null fieldmask, then all the fields in the field mask (and only those fields in the field mask) will be serialized. If the containing object does not have a fieldmask, then only non-empty fields will be serialized. - `java.util.List`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InterconnectClient this ^com.google.cloud.compute.v1.ProjectGlobalInterconnectName interconnect ^com.google.cloud.compute.v1.Interconnect interconnect-resource ^java.util.List field-mask]
    (-> this (.patchInterconnect interconnect interconnect-resource field-mask)))
  (^com.google.cloud.compute.v1.Operation [^InterconnectClient this ^com.google.cloud.compute.v1.PatchInterconnectHttpRequest request]
    (-> this (.patchInterconnect request))))

(defn shutdown
  ""
  ([^InterconnectClient this]
    (-> this (.shutdown))))

(defn get-diagnostics-interconnect
  "Returns the interconnectDiagnostics for the specified interconnect.

   Sample code:



   try (InterconnectClient interconnectClient = InterconnectClient.create()) {
     ProjectGlobalInterconnectName interconnect = ProjectGlobalInterconnectName.of(\"[PROJECT]\", \"[INTERCONNECT]\");
     InterconnectsGetDiagnosticsResponse response = interconnectClient.getDiagnosticsInterconnect(interconnect);
   }

  interconnect - Name of the interconnect resource to query. - `com.google.cloud.compute.v1.ProjectGlobalInterconnectName`

  returns: `com.google.cloud.compute.v1.InterconnectsGetDiagnosticsResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.InterconnectsGetDiagnosticsResponse [^InterconnectClient this ^com.google.cloud.compute.v1.ProjectGlobalInterconnectName interconnect]
    (-> this (.getDiagnosticsInterconnect interconnect))))

(defn close
  ""
  ([^InterconnectClient this]
    (-> this (.close))))

(defn insert-interconnect
  "Creates a Interconnect in the specified project using the data included in the request.

   Sample code:



   try (InterconnectClient interconnectClient = InterconnectClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     Interconnect interconnectResource = Interconnect.newBuilder().build();
     Operation response = interconnectClient.insertInterconnect(project, interconnectResource);
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`
  interconnect-resource - Represents an Interconnects resource. The Interconnects resource is a dedicated connection between Google's network and your on-premises network. For more information, see the Dedicated overview page. (== resource_for v1.interconnects ==) (== resource_for beta.interconnects ==) - `com.google.cloud.compute.v1.Interconnect`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InterconnectClient this ^com.google.cloud.compute.v1.ProjectName project ^com.google.cloud.compute.v1.Interconnect interconnect-resource]
    (-> this (.insertInterconnect project interconnect-resource)))
  (^com.google.cloud.compute.v1.Operation [^InterconnectClient this ^com.google.cloud.compute.v1.InsertInterconnectHttpRequest request]
    (-> this (.insertInterconnect request))))

(defn get-interconnect-callable
  "Returns the specified interconnect. Get a list of available interconnects by making a list()
   request.

   Sample code:



   try (InterconnectClient interconnectClient = InterconnectClient.create()) {
     String formattedInterconnect = ProjectGlobalInterconnectName.format(\"[PROJECT]\", \"[INTERCONNECT]\");
     GetInterconnectHttpRequest request = GetInterconnectHttpRequest.newBuilder()
       .setInterconnect(formattedInterconnect)
       .build();
     ApiFuture<Interconnect> future = interconnectClient.getInterconnectCallable().futureCall(request);
     // Do something
     Interconnect response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetInterconnectHttpRequest,com.google.cloud.compute.v1.Interconnect>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InterconnectClient this]
    (-> this (.getInterconnectCallable))))

(defn delete-interconnect-callable
  "Deletes the specified interconnect.

   Sample code:



   try (InterconnectClient interconnectClient = InterconnectClient.create()) {
     String formattedInterconnect = ProjectGlobalInterconnectName.format(\"[PROJECT]\", \"[INTERCONNECT]\");
     DeleteInterconnectHttpRequest request = DeleteInterconnectHttpRequest.newBuilder()
       .setInterconnect(formattedInterconnect)
       .build();
     ApiFuture<Operation> future = interconnectClient.deleteInterconnectCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteInterconnectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InterconnectClient this]
    (-> this (.deleteInterconnectCallable))))

(defn list-interconnects
  "Retrieves the list of interconnect available to the specified project.

   Sample code:



   try (InterconnectClient interconnectClient = InterconnectClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (Interconnect element : interconnectClient.listInterconnects(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.InterconnectClient$ListInterconnectsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.InterconnectClient$ListInterconnectsPagedResponse [^InterconnectClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.listInterconnects project))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^InterconnectClient this]
    (-> this (.isTerminated))))

(defn delete-interconnect
  "Deletes the specified interconnect.

   Sample code:



   try (InterconnectClient interconnectClient = InterconnectClient.create()) {
     ProjectGlobalInterconnectName interconnect = ProjectGlobalInterconnectName.of(\"[PROJECT]\", \"[INTERCONNECT]\");
     Operation response = interconnectClient.deleteInterconnect(interconnect);
   }

  interconnect - Name of the interconnect to delete. - `com.google.cloud.compute.v1.ProjectGlobalInterconnectName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InterconnectClient this ^com.google.cloud.compute.v1.ProjectGlobalInterconnectName interconnect]
    (-> this (.deleteInterconnect interconnect))))

(defn shutdown-now
  ""
  ([^InterconnectClient this]
    (-> this (.shutdownNow))))

