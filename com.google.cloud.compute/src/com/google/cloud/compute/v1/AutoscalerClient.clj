(ns com.google.cloud.compute.v1.AutoscalerClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (AutoscalerClient autoscalerClient = AutoscalerClient.create()) {
    ProjectZoneAutoscalerName autoscaler = ProjectZoneAutoscalerName.of(\"[PROJECT]\", \"[ZONE]\", \"[AUTOSCALER]\");
    Operation response = autoscalerClient.deleteAutoscaler(autoscaler);
  }

  Note: close() needs to be called on the autoscalerClient object to clean up resources such as
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

  This class can be customized by passing in a custom instance of AutoscalerSettings to
  create(). For example:

  To customize credentials:



  AutoscalerSettings autoscalerSettings =
      AutoscalerSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  AutoscalerClient autoscalerClient =
      AutoscalerClient.create(autoscalerSettings);

  To customize the endpoint:



  AutoscalerSettings autoscalerSettings =
      AutoscalerSettings.newBuilder().setEndpoint(myEndpoint).build();
  AutoscalerClient autoscalerClient =
      AutoscalerClient.create(autoscalerSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AutoscalerClient]))

(defn *create
  "Constructs an instance of AutoscalerClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.AutoscalerSettings`

  returns: `com.google.cloud.compute.v1.AutoscalerClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.AutoscalerClient [^com.google.cloud.compute.v1.AutoscalerSettings settings]
    (AutoscalerClient/create settings))
  (^com.google.cloud.compute.v1.AutoscalerClient []
    (AutoscalerClient/create )))

(defn list-autoscalers-callable
  "Retrieves a list of autoscalers contained within the specified zone.

   Sample code:



   try (AutoscalerClient autoscalerClient = AutoscalerClient.create()) {
     String formattedZone = ProjectZoneName.format(\"[PROJECT]\", \"[ZONE]\");
     ListAutoscalersHttpRequest request = ListAutoscalersHttpRequest.newBuilder()
       .setZone(formattedZone)
       .build();
     while (true) {
       AutoscalerList response = autoscalerClient.listAutoscalersCallable().call(request);
       for (Autoscaler element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListAutoscalersHttpRequest,com.google.cloud.compute.v1.AutoscalerList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoscalerClient this]
    (-> this (.listAutoscalersCallable))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.AutoscalerSettings`"
  (^com.google.cloud.compute.v1.AutoscalerSettings [^AutoscalerClient this]
    (-> this (.getSettings))))

(defn list-autoscalers
  "Retrieves a list of autoscalers contained within the specified zone.

   Sample code:



   try (AutoscalerClient autoscalerClient = AutoscalerClient.create()) {
     ProjectZoneName zone = ProjectZoneName.of(\"[PROJECT]\", \"[ZONE]\");
     for (Autoscaler element : autoscalerClient.listAutoscalers(zone).iterateAll()) {
       // doThingsWith(element);
     }
   }

  zone - Name of the zone for this request. - `com.google.cloud.compute.v1.ProjectZoneName`

  returns: `com.google.cloud.compute.v1.AutoscalerClient$ListAutoscalersPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.AutoscalerClient$ListAutoscalersPagedResponse [^AutoscalerClient this ^com.google.cloud.compute.v1.ProjectZoneName zone]
    (-> this (.listAutoscalers zone))))

(defn update-autoscaler-callable
  "Updates an autoscaler in the specified project using the data included in the request.

   Sample code:



   try (AutoscalerClient autoscalerClient = AutoscalerClient.create()) {
     String autoscaler = \"\";
     String formattedZone = ProjectZoneName.format(\"[PROJECT]\", \"[ZONE]\");
     Autoscaler autoscalerResource = Autoscaler.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     UpdateAutoscalerHttpRequest request = UpdateAutoscalerHttpRequest.newBuilder()
       .setAutoscaler(autoscaler)
       .setZone(formattedZone)
       .setAutoscalerResource(autoscalerResource)
       .addAllFieldMask(fieldMask)
       .build();
     ApiFuture<Operation> future = autoscalerClient.updateAutoscalerCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoscalerClient this]
    (-> this (.updateAutoscalerCallable))))

(defn delete-autoscaler
  "Deletes the specified autoscaler.

   Sample code:



   try (AutoscalerClient autoscalerClient = AutoscalerClient.create()) {
     ProjectZoneAutoscalerName autoscaler = ProjectZoneAutoscalerName.of(\"[PROJECT]\", \"[ZONE]\", \"[AUTOSCALER]\");
     Operation response = autoscalerClient.deleteAutoscaler(autoscaler);
   }

  autoscaler - Name of the autoscaler to delete. - `com.google.cloud.compute.v1.ProjectZoneAutoscalerName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^AutoscalerClient this ^com.google.cloud.compute.v1.ProjectZoneAutoscalerName autoscaler]
    (-> this (.deleteAutoscaler autoscaler))))

(defn get-autoscaler-callable
  "Returns the specified autoscaler resource. Gets a list of available autoscalers by making a
   list() request.

   Sample code:



   try (AutoscalerClient autoscalerClient = AutoscalerClient.create()) {
     String formattedAutoscaler = ProjectZoneAutoscalerName.format(\"[PROJECT]\", \"[ZONE]\", \"[AUTOSCALER]\");
     GetAutoscalerHttpRequest request = GetAutoscalerHttpRequest.newBuilder()
       .setAutoscaler(formattedAutoscaler)
       .build();
     ApiFuture<Autoscaler> future = autoscalerClient.getAutoscalerCallable().futureCall(request);
     // Do something
     Autoscaler response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetAutoscalerHttpRequest,com.google.cloud.compute.v1.Autoscaler>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoscalerClient this]
    (-> this (.getAutoscalerCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.AutoscalerStub`"
  ([^AutoscalerClient this]
    (-> this (.getStub))))

(defn insert-autoscaler
  "Creates an autoscaler in the specified project using the data included in the request.

   Sample code:



   try (AutoscalerClient autoscalerClient = AutoscalerClient.create()) {
     ProjectZoneName zone = ProjectZoneName.of(\"[PROJECT]\", \"[ZONE]\");
     Autoscaler autoscalerResource = Autoscaler.newBuilder().build();
     Operation response = autoscalerClient.insertAutoscaler(zone, autoscalerResource);
   }

  zone - Name of the zone for this request. - `com.google.cloud.compute.v1.ProjectZoneName`
  autoscaler-resource - Represents an Autoscaler resource. Autoscalers allow you to automatically scale virtual machine instances in managed instance groups according to an autoscaling policy that you define. For more information, read Autoscaling Groups of Instances. (== resource_for beta.autoscalers ==) (== resource_for v1.autoscalers ==) (== resource_for beta.regionAutoscalers ==) (== resource_for v1.regionAutoscalers ==) - `com.google.cloud.compute.v1.Autoscaler`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^AutoscalerClient this ^com.google.cloud.compute.v1.ProjectZoneName zone ^com.google.cloud.compute.v1.Autoscaler autoscaler-resource]
    (-> this (.insertAutoscaler zone autoscaler-resource)))
  (^com.google.cloud.compute.v1.Operation [^AutoscalerClient this ^com.google.cloud.compute.v1.InsertAutoscalerHttpRequest request]
    (-> this (.insertAutoscaler request))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^AutoscalerClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^AutoscalerClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn aggregated-list-autoscalers
  "Retrieves an aggregated list of autoscalers.

   Sample code:



   try (AutoscalerClient autoscalerClient = AutoscalerClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (AutoscalersScopedList element : autoscalerClient.aggregatedListAutoscalers(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.AutoscalerClient$AggregatedListAutoscalersPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.AutoscalerClient$AggregatedListAutoscalersPagedResponse [^AutoscalerClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.aggregatedListAutoscalers project))))

(defn shutdown
  ""
  ([^AutoscalerClient this]
    (-> this (.shutdown))))

(defn delete-autoscaler-callable
  "Deletes the specified autoscaler.

   Sample code:



   try (AutoscalerClient autoscalerClient = AutoscalerClient.create()) {
     String formattedAutoscaler = ProjectZoneAutoscalerName.format(\"[PROJECT]\", \"[ZONE]\", \"[AUTOSCALER]\");
     DeleteAutoscalerHttpRequest request = DeleteAutoscalerHttpRequest.newBuilder()
       .setAutoscaler(formattedAutoscaler)
       .build();
     ApiFuture<Operation> future = autoscalerClient.deleteAutoscalerCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoscalerClient this]
    (-> this (.deleteAutoscalerCallable))))

(defn get-autoscaler
  "Returns the specified autoscaler resource. Gets a list of available autoscalers by making a
   list() request.

   Sample code:



   try (AutoscalerClient autoscalerClient = AutoscalerClient.create()) {
     ProjectZoneAutoscalerName autoscaler = ProjectZoneAutoscalerName.of(\"[PROJECT]\", \"[ZONE]\", \"[AUTOSCALER]\");
     Autoscaler response = autoscalerClient.getAutoscaler(autoscaler);
   }

  autoscaler - Name of the autoscaler to return. - `com.google.cloud.compute.v1.ProjectZoneAutoscalerName`

  returns: `com.google.cloud.compute.v1.Autoscaler`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Autoscaler [^AutoscalerClient this ^com.google.cloud.compute.v1.ProjectZoneAutoscalerName autoscaler]
    (-> this (.getAutoscaler autoscaler))))

(defn insert-autoscaler-callable
  "Creates an autoscaler in the specified project using the data included in the request.

   Sample code:



   try (AutoscalerClient autoscalerClient = AutoscalerClient.create()) {
     String formattedZone = ProjectZoneName.format(\"[PROJECT]\", \"[ZONE]\");
     Autoscaler autoscalerResource = Autoscaler.newBuilder().build();
     InsertAutoscalerHttpRequest request = InsertAutoscalerHttpRequest.newBuilder()
       .setZone(formattedZone)
       .setAutoscalerResource(autoscalerResource)
       .build();
     ApiFuture<Operation> future = autoscalerClient.insertAutoscalerCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoscalerClient this]
    (-> this (.insertAutoscalerCallable))))

(defn close
  ""
  ([^AutoscalerClient this]
    (-> this (.close))))

(defn update-autoscaler
  "Updates an autoscaler in the specified project using the data included in the request.

   Sample code:



   try (AutoscalerClient autoscalerClient = AutoscalerClient.create()) {
     String autoscaler = \"\";
     ProjectZoneName zone = ProjectZoneName.of(\"[PROJECT]\", \"[ZONE]\");
     Autoscaler autoscalerResource = Autoscaler.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     Operation response = autoscalerClient.updateAutoscaler(autoscaler, zone, autoscalerResource, fieldMask);
   }

  autoscaler - Name of the autoscaler to update. - `java.lang.String`
  zone - Name of the zone for this request. - `com.google.cloud.compute.v1.ProjectZoneName`
  autoscaler-resource - Represents an Autoscaler resource. Autoscalers allow you to automatically scale virtual machine instances in managed instance groups according to an autoscaling policy that you define. For more information, read Autoscaling Groups of Instances. (== resource_for beta.autoscalers ==) (== resource_for v1.autoscalers ==) (== resource_for beta.regionAutoscalers ==) (== resource_for v1.regionAutoscalers ==) - `com.google.cloud.compute.v1.Autoscaler`
  field-mask - The fields that should be serialized (even if they have empty values). If the containing message object has a non-null fieldmask, then all the fields in the field mask (and only those fields in the field mask) will be serialized. If the containing object does not have a fieldmask, then only non-empty fields will be serialized. - `java.util.List`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^AutoscalerClient this ^java.lang.String autoscaler ^com.google.cloud.compute.v1.ProjectZoneName zone ^com.google.cloud.compute.v1.Autoscaler autoscaler-resource ^java.util.List field-mask]
    (-> this (.updateAutoscaler autoscaler zone autoscaler-resource field-mask)))
  (^com.google.cloud.compute.v1.Operation [^AutoscalerClient this ^com.google.cloud.compute.v1.UpdateAutoscalerHttpRequest request]
    (-> this (.updateAutoscaler request))))

(defn aggregated-list-autoscalers-callable
  "Retrieves an aggregated list of autoscalers.

   Sample code:



   try (AutoscalerClient autoscalerClient = AutoscalerClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListAutoscalersHttpRequest request = AggregatedListAutoscalersHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       AutoscalerAggregatedList response = autoscalerClient.aggregatedListAutoscalersCallable().call(request);
       for (AutoscalersScopedList element : response.getItemsMap()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListAutoscalersHttpRequest,com.google.cloud.compute.v1.AutoscalerAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoscalerClient this]
    (-> this (.aggregatedListAutoscalersCallable))))

(defn patch-autoscaler-callable
  "Updates an autoscaler in the specified project using the data included in the request. This
   method supports PATCH semantics and uses the JSON merge patch format and processing rules.

   Sample code:



   try (AutoscalerClient autoscalerClient = AutoscalerClient.create()) {
     String autoscaler = \"\";
     String formattedZone = ProjectZoneName.format(\"[PROJECT]\", \"[ZONE]\");
     Autoscaler autoscalerResource = Autoscaler.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     PatchAutoscalerHttpRequest request = PatchAutoscalerHttpRequest.newBuilder()
       .setAutoscaler(autoscaler)
       .setZone(formattedZone)
       .setAutoscalerResource(autoscalerResource)
       .addAllFieldMask(fieldMask)
       .build();
     ApiFuture<Operation> future = autoscalerClient.patchAutoscalerCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoscalerClient this]
    (-> this (.patchAutoscalerCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^AutoscalerClient this]
    (-> this (.isTerminated))))

(defn list-autoscalers-paged-callable
  "Retrieves a list of autoscalers contained within the specified zone.

   Sample code:



   try (AutoscalerClient autoscalerClient = AutoscalerClient.create()) {
     String formattedZone = ProjectZoneName.format(\"[PROJECT]\", \"[ZONE]\");
     ListAutoscalersHttpRequest request = ListAutoscalersHttpRequest.newBuilder()
       .setZone(formattedZone)
       .build();
     ApiFuture<ListAutoscalersPagedResponse> future = autoscalerClient.listAutoscalersPagedCallable().futureCall(request);
     // Do something
     for (Autoscaler element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListAutoscalersHttpRequest,com.google.cloud.compute.v1.AutoscalerClient$ListAutoscalersPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoscalerClient this]
    (-> this (.listAutoscalersPagedCallable))))

(defn patch-autoscaler
  "Updates an autoscaler in the specified project using the data included in the request. This
   method supports PATCH semantics and uses the JSON merge patch format and processing rules.

   Sample code:



   try (AutoscalerClient autoscalerClient = AutoscalerClient.create()) {
     String autoscaler = \"\";
     ProjectZoneName zone = ProjectZoneName.of(\"[PROJECT]\", \"[ZONE]\");
     Autoscaler autoscalerResource = Autoscaler.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     Operation response = autoscalerClient.patchAutoscaler(autoscaler, zone, autoscalerResource, fieldMask);
   }

  autoscaler - Name of the autoscaler to patch. - `java.lang.String`
  zone - Name of the zone for this request. - `com.google.cloud.compute.v1.ProjectZoneName`
  autoscaler-resource - Represents an Autoscaler resource. Autoscalers allow you to automatically scale virtual machine instances in managed instance groups according to an autoscaling policy that you define. For more information, read Autoscaling Groups of Instances. (== resource_for beta.autoscalers ==) (== resource_for v1.autoscalers ==) (== resource_for beta.regionAutoscalers ==) (== resource_for v1.regionAutoscalers ==) - `com.google.cloud.compute.v1.Autoscaler`
  field-mask - The fields that should be serialized (even if they have empty values). If the containing message object has a non-null fieldmask, then all the fields in the field mask (and only those fields in the field mask) will be serialized. If the containing object does not have a fieldmask, then only non-empty fields will be serialized. - `java.util.List`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^AutoscalerClient this ^java.lang.String autoscaler ^com.google.cloud.compute.v1.ProjectZoneName zone ^com.google.cloud.compute.v1.Autoscaler autoscaler-resource ^java.util.List field-mask]
    (-> this (.patchAutoscaler autoscaler zone autoscaler-resource field-mask)))
  (^com.google.cloud.compute.v1.Operation [^AutoscalerClient this ^com.google.cloud.compute.v1.PatchAutoscalerHttpRequest request]
    (-> this (.patchAutoscaler request))))

(defn shutdown-now
  ""
  ([^AutoscalerClient this]
    (-> this (.shutdownNow))))

(defn aggregated-list-autoscalers-paged-callable
  "Retrieves an aggregated list of autoscalers.

   Sample code:



   try (AutoscalerClient autoscalerClient = AutoscalerClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListAutoscalersHttpRequest request = AggregatedListAutoscalersHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<AggregatedListAutoscalersPagedResponse> future = autoscalerClient.aggregatedListAutoscalersPagedCallable().futureCall(request);
     // Do something
     for (AutoscalersScopedList element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListAutoscalersHttpRequest,com.google.cloud.compute.v1.AutoscalerClient$AggregatedListAutoscalersPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^AutoscalerClient this]
    (-> this (.aggregatedListAutoscalersPagedCallable))))

