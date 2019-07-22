(ns com.google.cloud.compute.v1.RegionAutoscalerClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (RegionAutoscalerClient regionAutoscalerClient = RegionAutoscalerClient.create()) {
    ProjectRegionAutoscalerName autoscaler = ProjectRegionAutoscalerName.of(\"[PROJECT]\", \"[REGION]\", \"[AUTOSCALER]\");
    Operation response = regionAutoscalerClient.deleteRegionAutoscaler(autoscaler);
  }

  Note: close() needs to be called on the regionAutoscalerClient object to clean up resources
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

  This class can be customized by passing in a custom instance of RegionAutoscalerSettings to
  create(). For example:

  To customize credentials:



  RegionAutoscalerSettings regionAutoscalerSettings =
      RegionAutoscalerSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  RegionAutoscalerClient regionAutoscalerClient =
      RegionAutoscalerClient.create(regionAutoscalerSettings);

  To customize the endpoint:



  RegionAutoscalerSettings regionAutoscalerSettings =
      RegionAutoscalerSettings.newBuilder().setEndpoint(myEndpoint).build();
  RegionAutoscalerClient regionAutoscalerClient =
      RegionAutoscalerClient.create(regionAutoscalerSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionAutoscalerClient]))

(defn *create
  "Constructs an instance of RegionAutoscalerClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.RegionAutoscalerSettings`

  returns: `com.google.cloud.compute.v1.RegionAutoscalerClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.RegionAutoscalerClient [^com.google.cloud.compute.v1.RegionAutoscalerSettings settings]
    (RegionAutoscalerClient/create settings))
  (^com.google.cloud.compute.v1.RegionAutoscalerClient []
    (RegionAutoscalerClient/create )))

(defn get-region-autoscaler-callable
  "Returns the specified autoscaler.

   Sample code:



   try (RegionAutoscalerClient regionAutoscalerClient = RegionAutoscalerClient.create()) {
     String formattedAutoscaler = ProjectRegionAutoscalerName.format(\"[PROJECT]\", \"[REGION]\", \"[AUTOSCALER]\");
     GetRegionAutoscalerHttpRequest request = GetRegionAutoscalerHttpRequest.newBuilder()
       .setAutoscaler(formattedAutoscaler)
       .build();
     ApiFuture<Autoscaler> future = regionAutoscalerClient.getRegionAutoscalerCallable().futureCall(request);
     // Do something
     Autoscaler response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetRegionAutoscalerHttpRequest,com.google.cloud.compute.v1.Autoscaler>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionAutoscalerClient this]
    (-> this (.getRegionAutoscalerCallable))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.RegionAutoscalerSettings`"
  (^com.google.cloud.compute.v1.RegionAutoscalerSettings [^RegionAutoscalerClient this]
    (-> this (.getSettings))))

(defn get-region-autoscaler
  "Returns the specified autoscaler.

   Sample code:



   try (RegionAutoscalerClient regionAutoscalerClient = RegionAutoscalerClient.create()) {
     ProjectRegionAutoscalerName autoscaler = ProjectRegionAutoscalerName.of(\"[PROJECT]\", \"[REGION]\", \"[AUTOSCALER]\");
     Autoscaler response = regionAutoscalerClient.getRegionAutoscaler(autoscaler);
   }

  autoscaler - Name of the autoscaler to return. - `com.google.cloud.compute.v1.ProjectRegionAutoscalerName`

  returns: `com.google.cloud.compute.v1.Autoscaler`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Autoscaler [^RegionAutoscalerClient this ^com.google.cloud.compute.v1.ProjectRegionAutoscalerName autoscaler]
    (-> this (.getRegionAutoscaler autoscaler))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.RegionAutoscalerStub`"
  ([^RegionAutoscalerClient this]
    (-> this (.getStub))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^RegionAutoscalerClient this]
    (-> this (.isShutdown))))

(defn patch-region-autoscaler-callable
  "Updates an autoscaler in the specified project using the data included in the request. This
   method supports PATCH semantics and uses the JSON merge patch format and processing rules.

   Sample code:



   try (RegionAutoscalerClient regionAutoscalerClient = RegionAutoscalerClient.create()) {
     String autoscaler = \"\";
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     Autoscaler autoscalerResource = Autoscaler.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     PatchRegionAutoscalerHttpRequest request = PatchRegionAutoscalerHttpRequest.newBuilder()
       .setAutoscaler(autoscaler)
       .setRegion(formattedRegion)
       .setAutoscalerResource(autoscalerResource)
       .addAllFieldMask(fieldMask)
       .build();
     ApiFuture<Operation> future = regionAutoscalerClient.patchRegionAutoscalerCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchRegionAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionAutoscalerClient this]
    (-> this (.patchRegionAutoscalerCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^RegionAutoscalerClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^RegionAutoscalerClient this]
    (-> this (.shutdown))))

(defn delete-region-autoscaler
  "Deletes the specified autoscaler.

   Sample code:



   try (RegionAutoscalerClient regionAutoscalerClient = RegionAutoscalerClient.create()) {
     ProjectRegionAutoscalerName autoscaler = ProjectRegionAutoscalerName.of(\"[PROJECT]\", \"[REGION]\", \"[AUTOSCALER]\");
     Operation response = regionAutoscalerClient.deleteRegionAutoscaler(autoscaler);
   }

  autoscaler - Name of the autoscaler to delete. - `com.google.cloud.compute.v1.ProjectRegionAutoscalerName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^RegionAutoscalerClient this ^com.google.cloud.compute.v1.ProjectRegionAutoscalerName autoscaler]
    (-> this (.deleteRegionAutoscaler autoscaler))))

(defn insert-region-autoscaler
  "Creates an autoscaler in the specified project using the data included in the request.

   Sample code:



   try (RegionAutoscalerClient regionAutoscalerClient = RegionAutoscalerClient.create()) {
     ProjectRegionName region = ProjectRegionName.of(\"[PROJECT]\", \"[REGION]\");
     Autoscaler autoscalerResource = Autoscaler.newBuilder().build();
     Operation response = regionAutoscalerClient.insertRegionAutoscaler(region, autoscalerResource);
   }

  region - Name of the region scoping this request. - `com.google.cloud.compute.v1.ProjectRegionName`
  autoscaler-resource - Represents an Autoscaler resource. Autoscalers allow you to automatically scale virtual machine instances in managed instance groups according to an autoscaling policy that you define. For more information, read Autoscaling Groups of Instances. (== resource_for beta.autoscalers ==) (== resource_for v1.autoscalers ==) (== resource_for beta.regionAutoscalers ==) (== resource_for v1.regionAutoscalers ==) - `com.google.cloud.compute.v1.Autoscaler`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^RegionAutoscalerClient this ^com.google.cloud.compute.v1.ProjectRegionName region ^com.google.cloud.compute.v1.Autoscaler autoscaler-resource]
    (-> this (.insertRegionAutoscaler region autoscaler-resource)))
  (^com.google.cloud.compute.v1.Operation [^RegionAutoscalerClient this ^com.google.cloud.compute.v1.InsertRegionAutoscalerHttpRequest request]
    (-> this (.insertRegionAutoscaler request))))

(defn update-region-autoscaler
  "Updates an autoscaler in the specified project using the data included in the request.

   Sample code:



   try (RegionAutoscalerClient regionAutoscalerClient = RegionAutoscalerClient.create()) {
     String autoscaler = \"\";
     ProjectRegionName region = ProjectRegionName.of(\"[PROJECT]\", \"[REGION]\");
     Autoscaler autoscalerResource = Autoscaler.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     Operation response = regionAutoscalerClient.updateRegionAutoscaler(autoscaler, region, autoscalerResource, fieldMask);
   }

  autoscaler - Name of the autoscaler to update. - `java.lang.String`
  region - Name of the region scoping this request. - `com.google.cloud.compute.v1.ProjectRegionName`
  autoscaler-resource - Represents an Autoscaler resource. Autoscalers allow you to automatically scale virtual machine instances in managed instance groups according to an autoscaling policy that you define. For more information, read Autoscaling Groups of Instances. (== resource_for beta.autoscalers ==) (== resource_for v1.autoscalers ==) (== resource_for beta.regionAutoscalers ==) (== resource_for v1.regionAutoscalers ==) - `com.google.cloud.compute.v1.Autoscaler`
  field-mask - The fields that should be serialized (even if they have empty values). If the containing message object has a non-null fieldmask, then all the fields in the field mask (and only those fields in the field mask) will be serialized. If the containing object does not have a fieldmask, then only non-empty fields will be serialized. - `java.util.List`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^RegionAutoscalerClient this ^java.lang.String autoscaler ^com.google.cloud.compute.v1.ProjectRegionName region ^com.google.cloud.compute.v1.Autoscaler autoscaler-resource ^java.util.List field-mask]
    (-> this (.updateRegionAutoscaler autoscaler region autoscaler-resource field-mask)))
  (^com.google.cloud.compute.v1.Operation [^RegionAutoscalerClient this ^com.google.cloud.compute.v1.UpdateRegionAutoscalerHttpRequest request]
    (-> this (.updateRegionAutoscaler request))))

(defn list-region-autoscalers-paged-callable
  "Retrieves a list of autoscalers contained within the specified region.

   Sample code:



   try (RegionAutoscalerClient regionAutoscalerClient = RegionAutoscalerClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     ListRegionAutoscalersHttpRequest request = ListRegionAutoscalersHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .build();
     ApiFuture<ListRegionAutoscalersPagedResponse> future = regionAutoscalerClient.listRegionAutoscalersPagedCallable().futureCall(request);
     // Do something
     for (Autoscaler element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionAutoscalersHttpRequest,com.google.cloud.compute.v1.RegionAutoscalerClient$ListRegionAutoscalersPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionAutoscalerClient this]
    (-> this (.listRegionAutoscalersPagedCallable))))

(defn close
  ""
  ([^RegionAutoscalerClient this]
    (-> this (.close))))

(defn insert-region-autoscaler-callable
  "Creates an autoscaler in the specified project using the data included in the request.

   Sample code:



   try (RegionAutoscalerClient regionAutoscalerClient = RegionAutoscalerClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     Autoscaler autoscalerResource = Autoscaler.newBuilder().build();
     InsertRegionAutoscalerHttpRequest request = InsertRegionAutoscalerHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .setAutoscalerResource(autoscalerResource)
       .build();
     ApiFuture<Operation> future = regionAutoscalerClient.insertRegionAutoscalerCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertRegionAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionAutoscalerClient this]
    (-> this (.insertRegionAutoscalerCallable))))

(defn delete-region-autoscaler-callable
  "Deletes the specified autoscaler.

   Sample code:



   try (RegionAutoscalerClient regionAutoscalerClient = RegionAutoscalerClient.create()) {
     String formattedAutoscaler = ProjectRegionAutoscalerName.format(\"[PROJECT]\", \"[REGION]\", \"[AUTOSCALER]\");
     DeleteRegionAutoscalerHttpRequest request = DeleteRegionAutoscalerHttpRequest.newBuilder()
       .setAutoscaler(formattedAutoscaler)
       .build();
     ApiFuture<Operation> future = regionAutoscalerClient.deleteRegionAutoscalerCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteRegionAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionAutoscalerClient this]
    (-> this (.deleteRegionAutoscalerCallable))))

(defn list-region-autoscalers
  "Retrieves a list of autoscalers contained within the specified region.

   Sample code:



   try (RegionAutoscalerClient regionAutoscalerClient = RegionAutoscalerClient.create()) {
     ProjectRegionName region = ProjectRegionName.of(\"[PROJECT]\", \"[REGION]\");
     for (Autoscaler element : regionAutoscalerClient.listRegionAutoscalers(region).iterateAll()) {
       // doThingsWith(element);
     }
   }

  region - Name of the region scoping this request. - `com.google.cloud.compute.v1.ProjectRegionName`

  returns: `com.google.cloud.compute.v1.RegionAutoscalerClient$ListRegionAutoscalersPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.RegionAutoscalerClient$ListRegionAutoscalersPagedResponse [^RegionAutoscalerClient this ^com.google.cloud.compute.v1.ProjectRegionName region]
    (-> this (.listRegionAutoscalers region))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^RegionAutoscalerClient this]
    (-> this (.isTerminated))))

(defn patch-region-autoscaler
  "Updates an autoscaler in the specified project using the data included in the request. This
   method supports PATCH semantics and uses the JSON merge patch format and processing rules.

   Sample code:



   try (RegionAutoscalerClient regionAutoscalerClient = RegionAutoscalerClient.create()) {
     String autoscaler = \"\";
     ProjectRegionName region = ProjectRegionName.of(\"[PROJECT]\", \"[REGION]\");
     Autoscaler autoscalerResource = Autoscaler.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     Operation response = regionAutoscalerClient.patchRegionAutoscaler(autoscaler, region, autoscalerResource, fieldMask);
   }

  autoscaler - Name of the autoscaler to patch. - `java.lang.String`
  region - Name of the region scoping this request. - `com.google.cloud.compute.v1.ProjectRegionName`
  autoscaler-resource - Represents an Autoscaler resource. Autoscalers allow you to automatically scale virtual machine instances in managed instance groups according to an autoscaling policy that you define. For more information, read Autoscaling Groups of Instances. (== resource_for beta.autoscalers ==) (== resource_for v1.autoscalers ==) (== resource_for beta.regionAutoscalers ==) (== resource_for v1.regionAutoscalers ==) - `com.google.cloud.compute.v1.Autoscaler`
  field-mask - The fields that should be serialized (even if they have empty values). If the containing message object has a non-null fieldmask, then all the fields in the field mask (and only those fields in the field mask) will be serialized. If the containing object does not have a fieldmask, then only non-empty fields will be serialized. - `java.util.List`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^RegionAutoscalerClient this ^java.lang.String autoscaler ^com.google.cloud.compute.v1.ProjectRegionName region ^com.google.cloud.compute.v1.Autoscaler autoscaler-resource ^java.util.List field-mask]
    (-> this (.patchRegionAutoscaler autoscaler region autoscaler-resource field-mask)))
  (^com.google.cloud.compute.v1.Operation [^RegionAutoscalerClient this ^com.google.cloud.compute.v1.PatchRegionAutoscalerHttpRequest request]
    (-> this (.patchRegionAutoscaler request))))

(defn list-region-autoscalers-callable
  "Retrieves a list of autoscalers contained within the specified region.

   Sample code:



   try (RegionAutoscalerClient regionAutoscalerClient = RegionAutoscalerClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     ListRegionAutoscalersHttpRequest request = ListRegionAutoscalersHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .build();
     while (true) {
       RegionAutoscalerList response = regionAutoscalerClient.listRegionAutoscalersCallable().call(request);
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionAutoscalersHttpRequest,com.google.cloud.compute.v1.RegionAutoscalerList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionAutoscalerClient this]
    (-> this (.listRegionAutoscalersCallable))))

(defn update-region-autoscaler-callable
  "Updates an autoscaler in the specified project using the data included in the request.

   Sample code:



   try (RegionAutoscalerClient regionAutoscalerClient = RegionAutoscalerClient.create()) {
     String autoscaler = \"\";
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     Autoscaler autoscalerResource = Autoscaler.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     UpdateRegionAutoscalerHttpRequest request = UpdateRegionAutoscalerHttpRequest.newBuilder()
       .setAutoscaler(autoscaler)
       .setRegion(formattedRegion)
       .setAutoscalerResource(autoscalerResource)
       .addAllFieldMask(fieldMask)
       .build();
     ApiFuture<Operation> future = regionAutoscalerClient.updateRegionAutoscalerCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateRegionAutoscalerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionAutoscalerClient this]
    (-> this (.updateRegionAutoscalerCallable))))

(defn shutdown-now
  ""
  ([^RegionAutoscalerClient this]
    (-> this (.shutdownNow))))

