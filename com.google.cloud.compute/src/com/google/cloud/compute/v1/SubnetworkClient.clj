(ns com.google.cloud.compute.v1.SubnetworkClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
    ProjectRegionSubnetworkName subnetwork = ProjectRegionSubnetworkName.of(\"[PROJECT]\", \"[REGION]\", \"[SUBNETWORK]\");
    Operation response = subnetworkClient.deleteSubnetwork(subnetwork);
  }

  Note: close() needs to be called on the subnetworkClient object to clean up resources such as
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

  This class can be customized by passing in a custom instance of SubnetworkSettings to
  create(). For example:

  To customize credentials:



  SubnetworkSettings subnetworkSettings =
      SubnetworkSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  SubnetworkClient subnetworkClient =
      SubnetworkClient.create(subnetworkSettings);

  To customize the endpoint:



  SubnetworkSettings subnetworkSettings =
      SubnetworkSettings.newBuilder().setEndpoint(myEndpoint).build();
  SubnetworkClient subnetworkClient =
      SubnetworkClient.create(subnetworkSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SubnetworkClient]))

(defn *create
  "Constructs an instance of SubnetworkClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.SubnetworkSettings`

  returns: `com.google.cloud.compute.v1.SubnetworkClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.SubnetworkClient [^com.google.cloud.compute.v1.SubnetworkSettings settings]
    (SubnetworkClient/create settings))
  (^com.google.cloud.compute.v1.SubnetworkClient []
    (SubnetworkClient/create )))

(defn list-usable-subnetworks-paged-callable
  "Retrieves an aggregated list of usable subnetworks.

   Sample code:



   try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListUsableSubnetworksHttpRequest request = ListUsableSubnetworksHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<ListUsableSubnetworksPagedResponse> future = subnetworkClient.listUsableSubnetworksPagedCallable().futureCall(request);
     // Do something
     for (UsableSubnetwork element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListUsableSubnetworksHttpRequest,com.google.cloud.compute.v1.SubnetworkClient$ListUsableSubnetworksPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubnetworkClient this]
    (-> this (.listUsableSubnetworksPagedCallable))))

(defn get-subnetwork-callable
  "Returns the specified subnetwork. Gets a list of available subnetworks list() request.

   Sample code:



   try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
     String formattedSubnetwork = ProjectRegionSubnetworkName.format(\"[PROJECT]\", \"[REGION]\", \"[SUBNETWORK]\");
     GetSubnetworkHttpRequest request = GetSubnetworkHttpRequest.newBuilder()
       .setSubnetwork(formattedSubnetwork)
       .build();
     ApiFuture<Subnetwork> future = subnetworkClient.getSubnetworkCallable().futureCall(request);
     // Do something
     Subnetwork response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetSubnetworkHttpRequest,com.google.cloud.compute.v1.Subnetwork>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubnetworkClient this]
    (-> this (.getSubnetworkCallable))))

(defn get-subnetwork
  "Returns the specified subnetwork. Gets a list of available subnetworks list() request.

   Sample code:



   try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
     ProjectRegionSubnetworkName subnetwork = ProjectRegionSubnetworkName.of(\"[PROJECT]\", \"[REGION]\", \"[SUBNETWORK]\");
     Subnetwork response = subnetworkClient.getSubnetwork(subnetwork);
   }

  subnetwork - Name of the Subnetwork resource to return. - `com.google.cloud.compute.v1.ProjectRegionSubnetworkName`

  returns: `com.google.cloud.compute.v1.Subnetwork`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Subnetwork [^SubnetworkClient this ^com.google.cloud.compute.v1.ProjectRegionSubnetworkName subnetwork]
    (-> this (.getSubnetwork subnetwork))))

(defn patch-subnetwork-callable
  "Patches the specified subnetwork with the data included in the request. Only certain fields can
   up updated with a patch request as indicated in the field descriptions. You must specify the
   current fingeprint of the subnetwork resource being patched.

   Sample code:



   try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
     String formattedSubnetwork = ProjectRegionSubnetworkName.format(\"[PROJECT]\", \"[REGION]\", \"[SUBNETWORK]\");
     Subnetwork subnetworkResource = Subnetwork.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     PatchSubnetworkHttpRequest request = PatchSubnetworkHttpRequest.newBuilder()
       .setSubnetwork(formattedSubnetwork)
       .setSubnetworkResource(subnetworkResource)
       .addAllFieldMask(fieldMask)
       .build();
     ApiFuture<Operation> future = subnetworkClient.patchSubnetworkCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchSubnetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubnetworkClient this]
    (-> this (.patchSubnetworkCallable))))

(defn set-private-ip-google-access-subnetwork-callable
  "Set whether VMs in this subnet can access Google services without assigning external IP
   addresses through Private Google Access.

   Sample code:



   try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
     String formattedSubnetwork = ProjectRegionSubnetworkName.format(\"[PROJECT]\", \"[REGION]\", \"[SUBNETWORK]\");
     SubnetworksSetPrivateIpGoogleAccessRequest subnetworksSetPrivateIpGoogleAccessRequestResource = SubnetworksSetPrivateIpGoogleAccessRequest.newBuilder().build();
     SetPrivateIpGoogleAccessSubnetworkHttpRequest request = SetPrivateIpGoogleAccessSubnetworkHttpRequest.newBuilder()
       .setSubnetwork(formattedSubnetwork)
       .setSubnetworksSetPrivateIpGoogleAccessRequestResource(subnetworksSetPrivateIpGoogleAccessRequestResource)
       .build();
     ApiFuture<Operation> future = subnetworkClient.setPrivateIpGoogleAccessSubnetworkCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetPrivateIpGoogleAccessSubnetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubnetworkClient this]
    (-> this (.setPrivateIpGoogleAccessSubnetworkCallable))))

(defn insert-subnetwork
  "Creates a subnetwork in the specified project using the data included in the request.

   Sample code:



   try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
     ProjectRegionName region = ProjectRegionName.of(\"[PROJECT]\", \"[REGION]\");
     Subnetwork subnetworkResource = Subnetwork.newBuilder().build();
     Operation response = subnetworkClient.insertSubnetwork(region, subnetworkResource);
   }

  region - Name of the region scoping this request. - `com.google.cloud.compute.v1.ProjectRegionName`
  subnetwork-resource - A Subnetwork resource. (== resource_for beta.subnetworks ==) (== resource_for v1.subnetworks ==) - `com.google.cloud.compute.v1.Subnetwork`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^SubnetworkClient this ^com.google.cloud.compute.v1.ProjectRegionName region ^com.google.cloud.compute.v1.Subnetwork subnetwork-resource]
    (-> this (.insertSubnetwork region subnetwork-resource)))
  (^com.google.cloud.compute.v1.Operation [^SubnetworkClient this ^com.google.cloud.compute.v1.InsertSubnetworkHttpRequest request]
    (-> this (.insertSubnetwork request))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.SubnetworkSettings`"
  (^com.google.cloud.compute.v1.SubnetworkSettings [^SubnetworkClient this]
    (-> this (.getSettings))))

(defn list-usable-subnetworks-callable
  "Retrieves an aggregated list of usable subnetworks.

   Sample code:



   try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ListUsableSubnetworksHttpRequest request = ListUsableSubnetworksHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       UsableSubnetworksAggregatedList response = subnetworkClient.listUsableSubnetworksCallable().call(request);
       for (UsableSubnetwork element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListUsableSubnetworksHttpRequest,com.google.cloud.compute.v1.UsableSubnetworksAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubnetworkClient this]
    (-> this (.listUsableSubnetworksCallable))))

(defn list-subnetworks-paged-callable
  "Retrieves a list of subnetworks available to the specified project.

   Sample code:



   try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     ListSubnetworksHttpRequest request = ListSubnetworksHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .build();
     ApiFuture<ListSubnetworksPagedResponse> future = subnetworkClient.listSubnetworksPagedCallable().futureCall(request);
     // Do something
     for (Subnetwork element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListSubnetworksHttpRequest,com.google.cloud.compute.v1.SubnetworkClient$ListSubnetworksPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubnetworkClient this]
    (-> this (.listSubnetworksPagedCallable))))

(defn list-subnetworks
  "Retrieves a list of subnetworks available to the specified project.

   Sample code:



   try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
     ProjectRegionName region = ProjectRegionName.of(\"[PROJECT]\", \"[REGION]\");
     for (Subnetwork element : subnetworkClient.listSubnetworks(region).iterateAll()) {
       // doThingsWith(element);
     }
   }

  region - Name of the region scoping this request. - `com.google.cloud.compute.v1.ProjectRegionName`

  returns: `com.google.cloud.compute.v1.SubnetworkClient$ListSubnetworksPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.SubnetworkClient$ListSubnetworksPagedResponse [^SubnetworkClient this ^com.google.cloud.compute.v1.ProjectRegionName region]
    (-> this (.listSubnetworks region))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.SubnetworkStub`"
  ([^SubnetworkClient this]
    (-> this (.getStub))))

(defn delete-subnetwork
  "Deletes the specified subnetwork.

   Sample code:



   try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
     ProjectRegionSubnetworkName subnetwork = ProjectRegionSubnetworkName.of(\"[PROJECT]\", \"[REGION]\", \"[SUBNETWORK]\");
     Operation response = subnetworkClient.deleteSubnetwork(subnetwork);
   }

  subnetwork - Name of the Subnetwork resource to delete. - `com.google.cloud.compute.v1.ProjectRegionSubnetworkName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^SubnetworkClient this ^com.google.cloud.compute.v1.ProjectRegionSubnetworkName subnetwork]
    (-> this (.deleteSubnetwork subnetwork))))

(defn aggregated-list-subnetworks
  "Retrieves an aggregated list of subnetworks.

   Sample code:



   try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (SubnetworksScopedList element : subnetworkClient.aggregatedListSubnetworks(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.SubnetworkClient$AggregatedListSubnetworksPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.SubnetworkClient$AggregatedListSubnetworksPagedResponse [^SubnetworkClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.aggregatedListSubnetworks project))))

(defn test-iam-permissions-subnetwork-callable
  "Returns permissions that a caller has on the specified resource.

   Sample code:



   try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
     String formattedResource = ProjectRegionSubnetworkResourceName.format(\"[PROJECT]\", \"[REGION]\", \"[RESOURCE]\");
     TestPermissionsRequest testPermissionsRequestResource = TestPermissionsRequest.newBuilder().build();
     TestIamPermissionsSubnetworkHttpRequest request = TestIamPermissionsSubnetworkHttpRequest.newBuilder()
       .setResource(formattedResource)
       .setTestPermissionsRequestResource(testPermissionsRequestResource)
       .build();
     ApiFuture<TestPermissionsResponse> future = subnetworkClient.testIamPermissionsSubnetworkCallable().futureCall(request);
     // Do something
     TestPermissionsResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.TestIamPermissionsSubnetworkHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubnetworkClient this]
    (-> this (.testIamPermissionsSubnetworkCallable))))

(defn list-subnetworks-callable
  "Retrieves a list of subnetworks available to the specified project.

   Sample code:



   try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     ListSubnetworksHttpRequest request = ListSubnetworksHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .build();
     while (true) {
       SubnetworkList response = subnetworkClient.listSubnetworksCallable().call(request);
       for (Subnetwork element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListSubnetworksHttpRequest,com.google.cloud.compute.v1.SubnetworkList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubnetworkClient this]
    (-> this (.listSubnetworksCallable))))

(defn expand-ip-cidr-range-subnetwork-callable
  "Expands the IP CIDR range of the subnetwork to a specified value.

   Sample code:



   try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
     String formattedSubnetwork = ProjectRegionSubnetworkName.format(\"[PROJECT]\", \"[REGION]\", \"[SUBNETWORK]\");
     SubnetworksExpandIpCidrRangeRequest subnetworksExpandIpCidrRangeRequestResource = SubnetworksExpandIpCidrRangeRequest.newBuilder().build();
     ExpandIpCidrRangeSubnetworkHttpRequest request = ExpandIpCidrRangeSubnetworkHttpRequest.newBuilder()
       .setSubnetwork(formattedSubnetwork)
       .setSubnetworksExpandIpCidrRangeRequestResource(subnetworksExpandIpCidrRangeRequestResource)
       .build();
     ApiFuture<Operation> future = subnetworkClient.expandIpCidrRangeSubnetworkCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ExpandIpCidrRangeSubnetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubnetworkClient this]
    (-> this (.expandIpCidrRangeSubnetworkCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^SubnetworkClient this]
    (-> this (.isShutdown))))

(defn list-usable-subnetworks
  "Retrieves an aggregated list of usable subnetworks.

   Sample code:



   try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (UsableSubnetwork element : subnetworkClient.listUsableSubnetworks(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.SubnetworkClient$ListUsableSubnetworksPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.SubnetworkClient$ListUsableSubnetworksPagedResponse [^SubnetworkClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.listUsableSubnetworks project))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^SubnetworkClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^SubnetworkClient this]
    (-> this (.shutdown))))

(defn patch-subnetwork
  "Patches the specified subnetwork with the data included in the request. Only certain fields can
   up updated with a patch request as indicated in the field descriptions. You must specify the
   current fingeprint of the subnetwork resource being patched.

   Sample code:



   try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
     ProjectRegionSubnetworkName subnetwork = ProjectRegionSubnetworkName.of(\"[PROJECT]\", \"[REGION]\", \"[SUBNETWORK]\");
     Subnetwork subnetworkResource = Subnetwork.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     Operation response = subnetworkClient.patchSubnetwork(subnetwork, subnetworkResource, fieldMask);
   }

  subnetwork - Name of the Subnetwork resource to patch. - `com.google.cloud.compute.v1.ProjectRegionSubnetworkName`
  subnetwork-resource - A Subnetwork resource. (== resource_for beta.subnetworks ==) (== resource_for v1.subnetworks ==) - `com.google.cloud.compute.v1.Subnetwork`
  field-mask - The fields that should be serialized (even if they have empty values). If the containing message object has a non-null fieldmask, then all the fields in the field mask (and only those fields in the field mask) will be serialized. If the containing object does not have a fieldmask, then only non-empty fields will be serialized. - `java.util.List`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^SubnetworkClient this ^com.google.cloud.compute.v1.ProjectRegionSubnetworkName subnetwork ^com.google.cloud.compute.v1.Subnetwork subnetwork-resource ^java.util.List field-mask]
    (-> this (.patchSubnetwork subnetwork subnetwork-resource field-mask)))
  (^com.google.cloud.compute.v1.Operation [^SubnetworkClient this ^com.google.cloud.compute.v1.PatchSubnetworkHttpRequest request]
    (-> this (.patchSubnetwork request))))

(defn insert-subnetwork-callable
  "Creates a subnetwork in the specified project using the data included in the request.

   Sample code:



   try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     Subnetwork subnetworkResource = Subnetwork.newBuilder().build();
     InsertSubnetworkHttpRequest request = InsertSubnetworkHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .setSubnetworkResource(subnetworkResource)
       .build();
     ApiFuture<Operation> future = subnetworkClient.insertSubnetworkCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertSubnetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubnetworkClient this]
    (-> this (.insertSubnetworkCallable))))

(defn delete-subnetwork-callable
  "Deletes the specified subnetwork.

   Sample code:



   try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
     String formattedSubnetwork = ProjectRegionSubnetworkName.format(\"[PROJECT]\", \"[REGION]\", \"[SUBNETWORK]\");
     DeleteSubnetworkHttpRequest request = DeleteSubnetworkHttpRequest.newBuilder()
       .setSubnetwork(formattedSubnetwork)
       .build();
     ApiFuture<Operation> future = subnetworkClient.deleteSubnetworkCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteSubnetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubnetworkClient this]
    (-> this (.deleteSubnetworkCallable))))

(defn close
  ""
  ([^SubnetworkClient this]
    (-> this (.close))))

(defn set-iam-policy-subnetwork-callable
  "Sets the access control policy on the specified resource. Replaces any existing policy.

   Sample code:



   try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
     String formattedResource = ProjectRegionSubnetworkResourceName.format(\"[PROJECT]\", \"[REGION]\", \"[RESOURCE]\");
     RegionSetPolicyRequest regionSetPolicyRequestResource = RegionSetPolicyRequest.newBuilder().build();
     SetIamPolicySubnetworkHttpRequest request = SetIamPolicySubnetworkHttpRequest.newBuilder()
       .setResource(formattedResource)
       .setRegionSetPolicyRequestResource(regionSetPolicyRequestResource)
       .build();
     ApiFuture<Policy> future = subnetworkClient.setIamPolicySubnetworkCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetIamPolicySubnetworkHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubnetworkClient this]
    (-> this (.setIamPolicySubnetworkCallable))))

(defn aggregated-list-subnetworks-paged-callable
  "Retrieves an aggregated list of subnetworks.

   Sample code:



   try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListSubnetworksHttpRequest request = AggregatedListSubnetworksHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<AggregatedListSubnetworksPagedResponse> future = subnetworkClient.aggregatedListSubnetworksPagedCallable().futureCall(request);
     // Do something
     for (SubnetworksScopedList element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListSubnetworksHttpRequest,com.google.cloud.compute.v1.SubnetworkClient$AggregatedListSubnetworksPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubnetworkClient this]
    (-> this (.aggregatedListSubnetworksPagedCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^SubnetworkClient this]
    (-> this (.isTerminated))))

(defn set-iam-policy-subnetwork
  "Sets the access control policy on the specified resource. Replaces any existing policy.

   Sample code:



   try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
     ProjectRegionSubnetworkResourceName resource = ProjectRegionSubnetworkResourceName.of(\"[PROJECT]\", \"[REGION]\", \"[RESOURCE]\");
     RegionSetPolicyRequest regionSetPolicyRequestResource = RegionSetPolicyRequest.newBuilder().build();
     Policy response = subnetworkClient.setIamPolicySubnetwork(resource, regionSetPolicyRequestResource);
   }

  resource - Name or id of the resource for this request. - `com.google.cloud.compute.v1.ProjectRegionSubnetworkResourceName`
  region-set-policy-request-resource - `com.google.cloud.compute.v1.RegionSetPolicyRequest`

  returns: `com.google.cloud.compute.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Policy [^SubnetworkClient this ^com.google.cloud.compute.v1.ProjectRegionSubnetworkResourceName resource ^com.google.cloud.compute.v1.RegionSetPolicyRequest region-set-policy-request-resource]
    (-> this (.setIamPolicySubnetwork resource region-set-policy-request-resource)))
  (^com.google.cloud.compute.v1.Policy [^SubnetworkClient this ^com.google.cloud.compute.v1.SetIamPolicySubnetworkHttpRequest request]
    (-> this (.setIamPolicySubnetwork request))))

(defn aggregated-list-subnetworks-callable
  "Retrieves an aggregated list of subnetworks.

   Sample code:



   try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListSubnetworksHttpRequest request = AggregatedListSubnetworksHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       SubnetworkAggregatedList response = subnetworkClient.aggregatedListSubnetworksCallable().call(request);
       for (SubnetworksScopedList element : response.getItemsMap()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListSubnetworksHttpRequest,com.google.cloud.compute.v1.SubnetworkAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubnetworkClient this]
    (-> this (.aggregatedListSubnetworksCallable))))

(defn set-private-ip-google-access-subnetwork
  "Set whether VMs in this subnet can access Google services without assigning external IP
   addresses through Private Google Access.

   Sample code:



   try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
     ProjectRegionSubnetworkName subnetwork = ProjectRegionSubnetworkName.of(\"[PROJECT]\", \"[REGION]\", \"[SUBNETWORK]\");
     SubnetworksSetPrivateIpGoogleAccessRequest subnetworksSetPrivateIpGoogleAccessRequestResource = SubnetworksSetPrivateIpGoogleAccessRequest.newBuilder().build();
     Operation response = subnetworkClient.setPrivateIpGoogleAccessSubnetwork(subnetwork, subnetworksSetPrivateIpGoogleAccessRequestResource);
   }

  subnetwork - Name of the Subnetwork resource. - `com.google.cloud.compute.v1.ProjectRegionSubnetworkName`
  subnetworks-set-private-ip-google-access-request-resource - `com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^SubnetworkClient this ^com.google.cloud.compute.v1.ProjectRegionSubnetworkName subnetwork ^com.google.cloud.compute.v1.SubnetworksSetPrivateIpGoogleAccessRequest subnetworks-set-private-ip-google-access-request-resource]
    (-> this (.setPrivateIpGoogleAccessSubnetwork subnetwork subnetworks-set-private-ip-google-access-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^SubnetworkClient this ^com.google.cloud.compute.v1.SetPrivateIpGoogleAccessSubnetworkHttpRequest request]
    (-> this (.setPrivateIpGoogleAccessSubnetwork request))))

(defn get-iam-policy-subnetwork-callable
  "Gets the access control policy for a resource. May be empty if no such policy or resource
   exists.

   Sample code:



   try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
     String formattedResource = ProjectRegionSubnetworkResourceName.format(\"[PROJECT]\", \"[REGION]\", \"[RESOURCE]\");
     GetIamPolicySubnetworkHttpRequest request = GetIamPolicySubnetworkHttpRequest.newBuilder()
       .setResource(formattedResource)
       .build();
     ApiFuture<Policy> future = subnetworkClient.getIamPolicySubnetworkCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetIamPolicySubnetworkHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubnetworkClient this]
    (-> this (.getIamPolicySubnetworkCallable))))

(defn shutdown-now
  ""
  ([^SubnetworkClient this]
    (-> this (.shutdownNow))))

(defn get-iam-policy-subnetwork
  "Gets the access control policy for a resource. May be empty if no such policy or resource
   exists.

   Sample code:



   try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
     ProjectRegionSubnetworkResourceName resource = ProjectRegionSubnetworkResourceName.of(\"[PROJECT]\", \"[REGION]\", \"[RESOURCE]\");
     Policy response = subnetworkClient.getIamPolicySubnetwork(resource);
   }

  resource - Name or id of the resource for this request. - `com.google.cloud.compute.v1.ProjectRegionSubnetworkResourceName`

  returns: `com.google.cloud.compute.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Policy [^SubnetworkClient this ^com.google.cloud.compute.v1.ProjectRegionSubnetworkResourceName resource]
    (-> this (.getIamPolicySubnetwork resource))))

(defn test-iam-permissions-subnetwork
  "Returns permissions that a caller has on the specified resource.

   Sample code:



   try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
     ProjectRegionSubnetworkResourceName resource = ProjectRegionSubnetworkResourceName.of(\"[PROJECT]\", \"[REGION]\", \"[RESOURCE]\");
     TestPermissionsRequest testPermissionsRequestResource = TestPermissionsRequest.newBuilder().build();
     TestPermissionsResponse response = subnetworkClient.testIamPermissionsSubnetwork(resource, testPermissionsRequestResource);
   }

  resource - Name or id of the resource for this request. - `com.google.cloud.compute.v1.ProjectRegionSubnetworkResourceName`
  test-permissions-request-resource - `com.google.cloud.compute.v1.TestPermissionsRequest`

  returns: `com.google.cloud.compute.v1.TestPermissionsResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.TestPermissionsResponse [^SubnetworkClient this ^com.google.cloud.compute.v1.ProjectRegionSubnetworkResourceName resource ^com.google.cloud.compute.v1.TestPermissionsRequest test-permissions-request-resource]
    (-> this (.testIamPermissionsSubnetwork resource test-permissions-request-resource)))
  (^com.google.cloud.compute.v1.TestPermissionsResponse [^SubnetworkClient this ^com.google.cloud.compute.v1.TestIamPermissionsSubnetworkHttpRequest request]
    (-> this (.testIamPermissionsSubnetwork request))))

(defn expand-ip-cidr-range-subnetwork
  "Expands the IP CIDR range of the subnetwork to a specified value.

   Sample code:



   try (SubnetworkClient subnetworkClient = SubnetworkClient.create()) {
     ProjectRegionSubnetworkName subnetwork = ProjectRegionSubnetworkName.of(\"[PROJECT]\", \"[REGION]\", \"[SUBNETWORK]\");
     SubnetworksExpandIpCidrRangeRequest subnetworksExpandIpCidrRangeRequestResource = SubnetworksExpandIpCidrRangeRequest.newBuilder().build();
     Operation response = subnetworkClient.expandIpCidrRangeSubnetwork(subnetwork, subnetworksExpandIpCidrRangeRequestResource);
   }

  subnetwork - Name of the Subnetwork resource to update. - `com.google.cloud.compute.v1.ProjectRegionSubnetworkName`
  subnetworks-expand-ip-cidr-range-request-resource - `com.google.cloud.compute.v1.SubnetworksExpandIpCidrRangeRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^SubnetworkClient this ^com.google.cloud.compute.v1.ProjectRegionSubnetworkName subnetwork ^com.google.cloud.compute.v1.SubnetworksExpandIpCidrRangeRequest subnetworks-expand-ip-cidr-range-request-resource]
    (-> this (.expandIpCidrRangeSubnetwork subnetwork subnetworks-expand-ip-cidr-range-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^SubnetworkClient this ^com.google.cloud.compute.v1.ExpandIpCidrRangeSubnetworkHttpRequest request]
    (-> this (.expandIpCidrRangeSubnetwork request))))

