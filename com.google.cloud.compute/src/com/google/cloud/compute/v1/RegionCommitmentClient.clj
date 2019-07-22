(ns com.google.cloud.compute.v1.RegionCommitmentClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (RegionCommitmentClient regionCommitmentClient = RegionCommitmentClient.create()) {
    ProjectRegionCommitmentName commitment = ProjectRegionCommitmentName.of(\"[PROJECT]\", \"[REGION]\", \"[COMMITMENT]\");
    Commitment response = regionCommitmentClient.getRegionCommitment(commitment);
  }

  Note: close() needs to be called on the regionCommitmentClient object to clean up resources
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

  This class can be customized by passing in a custom instance of RegionCommitmentSettings to
  create(). For example:

  To customize credentials:



  RegionCommitmentSettings regionCommitmentSettings =
      RegionCommitmentSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  RegionCommitmentClient regionCommitmentClient =
      RegionCommitmentClient.create(regionCommitmentSettings);

  To customize the endpoint:



  RegionCommitmentSettings regionCommitmentSettings =
      RegionCommitmentSettings.newBuilder().setEndpoint(myEndpoint).build();
  RegionCommitmentClient regionCommitmentClient =
      RegionCommitmentClient.create(regionCommitmentSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionCommitmentClient]))

(defn *create
  "Constructs an instance of RegionCommitmentClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.RegionCommitmentSettings`

  returns: `com.google.cloud.compute.v1.RegionCommitmentClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.RegionCommitmentClient [^com.google.cloud.compute.v1.RegionCommitmentSettings settings]
    (RegionCommitmentClient/create settings))
  (^com.google.cloud.compute.v1.RegionCommitmentClient []
    (RegionCommitmentClient/create )))

(defn insert-region-commitment
  "Creates a commitment in the specified project using the data included in the request.

   Sample code:



   try (RegionCommitmentClient regionCommitmentClient = RegionCommitmentClient.create()) {
     ProjectRegionName region = ProjectRegionName.of(\"[PROJECT]\", \"[REGION]\");
     Commitment commitmentResource = Commitment.newBuilder().build();
     Operation response = regionCommitmentClient.insertRegionCommitment(region, commitmentResource);
   }

  region - Name of the region for this request. - `com.google.cloud.compute.v1.ProjectRegionName`
  commitment-resource - Represents a Commitment resource. Creating a Commitment resource means that you are purchasing a committed use contract with an explicit start and end time. You can create commitments based on vCPUs and memory usage and receive discounted rates. For full details, read Signing Up for Committed Use Discounts. Committed use discounts are subject to Google Cloud Platform's Service Specific Terms. By purchasing a committed use discount, you agree to these terms. Committed use discounts will not renew, so you must purchase a new commitment to continue receiving discounts. (== resource_for beta.commitments ==) (== resource_for v1.commitments ==) - `com.google.cloud.compute.v1.Commitment`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^RegionCommitmentClient this ^com.google.cloud.compute.v1.ProjectRegionName region ^com.google.cloud.compute.v1.Commitment commitment-resource]
    (-> this (.insertRegionCommitment region commitment-resource)))
  (^com.google.cloud.compute.v1.Operation [^RegionCommitmentClient this ^com.google.cloud.compute.v1.InsertRegionCommitmentHttpRequest request]
    (-> this (.insertRegionCommitment request))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.RegionCommitmentSettings`"
  (^com.google.cloud.compute.v1.RegionCommitmentSettings [^RegionCommitmentClient this]
    (-> this (.getSettings))))

(defn aggregated-list-region-commitments
  "Retrieves an aggregated list of commitments.

   Sample code:



   try (RegionCommitmentClient regionCommitmentClient = RegionCommitmentClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (CommitmentsScopedList element : regionCommitmentClient.aggregatedListRegionCommitments(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.RegionCommitmentClient$AggregatedListRegionCommitmentsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.RegionCommitmentClient$AggregatedListRegionCommitmentsPagedResponse [^RegionCommitmentClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.aggregatedListRegionCommitments project))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.RegionCommitmentStub`"
  ([^RegionCommitmentClient this]
    (-> this (.getStub))))

(defn aggregated-list-region-commitments-callable
  "Retrieves an aggregated list of commitments.

   Sample code:



   try (RegionCommitmentClient regionCommitmentClient = RegionCommitmentClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListRegionCommitmentsHttpRequest request = AggregatedListRegionCommitmentsHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       CommitmentAggregatedList response = regionCommitmentClient.aggregatedListRegionCommitmentsCallable().call(request);
       for (CommitmentsScopedList element : response.getItemsMap()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListRegionCommitmentsHttpRequest,com.google.cloud.compute.v1.CommitmentAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionCommitmentClient this]
    (-> this (.aggregatedListRegionCommitmentsCallable))))

(defn list-region-commitments-paged-callable
  "Retrieves a list of commitments contained within the specified region.

   Sample code:



   try (RegionCommitmentClient regionCommitmentClient = RegionCommitmentClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     ListRegionCommitmentsHttpRequest request = ListRegionCommitmentsHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .build();
     ApiFuture<ListRegionCommitmentsPagedResponse> future = regionCommitmentClient.listRegionCommitmentsPagedCallable().futureCall(request);
     // Do something
     for (Commitment element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionCommitmentsHttpRequest,com.google.cloud.compute.v1.RegionCommitmentClient$ListRegionCommitmentsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionCommitmentClient this]
    (-> this (.listRegionCommitmentsPagedCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^RegionCommitmentClient this]
    (-> this (.isShutdown))))

(defn list-region-commitments
  "Retrieves a list of commitments contained within the specified region.

   Sample code:



   try (RegionCommitmentClient regionCommitmentClient = RegionCommitmentClient.create()) {
     ProjectRegionName region = ProjectRegionName.of(\"[PROJECT]\", \"[REGION]\");
     for (Commitment element : regionCommitmentClient.listRegionCommitments(region).iterateAll()) {
       // doThingsWith(element);
     }
   }

  region - Name of the region for this request. - `com.google.cloud.compute.v1.ProjectRegionName`

  returns: `com.google.cloud.compute.v1.RegionCommitmentClient$ListRegionCommitmentsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.RegionCommitmentClient$ListRegionCommitmentsPagedResponse [^RegionCommitmentClient this ^com.google.cloud.compute.v1.ProjectRegionName region]
    (-> this (.listRegionCommitments region))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^RegionCommitmentClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^RegionCommitmentClient this]
    (-> this (.shutdown))))

(defn aggregated-list-region-commitments-paged-callable
  "Retrieves an aggregated list of commitments.

   Sample code:



   try (RegionCommitmentClient regionCommitmentClient = RegionCommitmentClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListRegionCommitmentsHttpRequest request = AggregatedListRegionCommitmentsHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<AggregatedListRegionCommitmentsPagedResponse> future = regionCommitmentClient.aggregatedListRegionCommitmentsPagedCallable().futureCall(request);
     // Do something
     for (CommitmentsScopedList element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListRegionCommitmentsHttpRequest,com.google.cloud.compute.v1.RegionCommitmentClient$AggregatedListRegionCommitmentsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionCommitmentClient this]
    (-> this (.aggregatedListRegionCommitmentsPagedCallable))))

(defn close
  ""
  ([^RegionCommitmentClient this]
    (-> this (.close))))

(defn list-region-commitments-callable
  "Retrieves a list of commitments contained within the specified region.

   Sample code:



   try (RegionCommitmentClient regionCommitmentClient = RegionCommitmentClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     ListRegionCommitmentsHttpRequest request = ListRegionCommitmentsHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .build();
     while (true) {
       CommitmentList response = regionCommitmentClient.listRegionCommitmentsCallable().call(request);
       for (Commitment element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionCommitmentsHttpRequest,com.google.cloud.compute.v1.CommitmentList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionCommitmentClient this]
    (-> this (.listRegionCommitmentsCallable))))

(defn insert-region-commitment-callable
  "Creates a commitment in the specified project using the data included in the request.

   Sample code:



   try (RegionCommitmentClient regionCommitmentClient = RegionCommitmentClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     Commitment commitmentResource = Commitment.newBuilder().build();
     InsertRegionCommitmentHttpRequest request = InsertRegionCommitmentHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .setCommitmentResource(commitmentResource)
       .build();
     ApiFuture<Operation> future = regionCommitmentClient.insertRegionCommitmentCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertRegionCommitmentHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionCommitmentClient this]
    (-> this (.insertRegionCommitmentCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^RegionCommitmentClient this]
    (-> this (.isTerminated))))

(defn get-region-commitment-callable
  "Returns the specified commitment resource. Gets a list of available commitments by making a
   list() request.

   Sample code:



   try (RegionCommitmentClient regionCommitmentClient = RegionCommitmentClient.create()) {
     String formattedCommitment = ProjectRegionCommitmentName.format(\"[PROJECT]\", \"[REGION]\", \"[COMMITMENT]\");
     GetRegionCommitmentHttpRequest request = GetRegionCommitmentHttpRequest.newBuilder()
       .setCommitment(formattedCommitment)
       .build();
     ApiFuture<Commitment> future = regionCommitmentClient.getRegionCommitmentCallable().futureCall(request);
     // Do something
     Commitment response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetRegionCommitmentHttpRequest,com.google.cloud.compute.v1.Commitment>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionCommitmentClient this]
    (-> this (.getRegionCommitmentCallable))))

(defn get-region-commitment
  "Returns the specified commitment resource. Gets a list of available commitments by making a
   list() request.

   Sample code:



   try (RegionCommitmentClient regionCommitmentClient = RegionCommitmentClient.create()) {
     ProjectRegionCommitmentName commitment = ProjectRegionCommitmentName.of(\"[PROJECT]\", \"[REGION]\", \"[COMMITMENT]\");
     Commitment response = regionCommitmentClient.getRegionCommitment(commitment);
   }

  commitment - Name of the commitment to return. - `com.google.cloud.compute.v1.ProjectRegionCommitmentName`

  returns: `com.google.cloud.compute.v1.Commitment`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Commitment [^RegionCommitmentClient this ^com.google.cloud.compute.v1.ProjectRegionCommitmentName commitment]
    (-> this (.getRegionCommitment commitment))))

(defn shutdown-now
  ""
  ([^RegionCommitmentClient this]
    (-> this (.shutdownNow))))

