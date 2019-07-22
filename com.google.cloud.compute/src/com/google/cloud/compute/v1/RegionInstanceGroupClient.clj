(ns com.google.cloud.compute.v1.RegionInstanceGroupClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (RegionInstanceGroupClient regionInstanceGroupClient = RegionInstanceGroupClient.create()) {
    ProjectRegionInstanceGroupName instanceGroup = ProjectRegionInstanceGroupName.of(\"[PROJECT]\", \"[REGION]\", \"[INSTANCE_GROUP]\");
    InstanceGroup response = regionInstanceGroupClient.getRegionInstanceGroup(instanceGroup);
  }

  Note: close() needs to be called on the regionInstanceGroupClient object to clean up resources
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

  This class can be customized by passing in a custom instance of RegionInstanceGroupSettings to
  create(). For example:

  To customize credentials:



  RegionInstanceGroupSettings regionInstanceGroupSettings =
      RegionInstanceGroupSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  RegionInstanceGroupClient regionInstanceGroupClient =
      RegionInstanceGroupClient.create(regionInstanceGroupSettings);

  To customize the endpoint:



  RegionInstanceGroupSettings regionInstanceGroupSettings =
      RegionInstanceGroupSettings.newBuilder().setEndpoint(myEndpoint).build();
  RegionInstanceGroupClient regionInstanceGroupClient =
      RegionInstanceGroupClient.create(regionInstanceGroupSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionInstanceGroupClient]))

(defn *create
  "Constructs an instance of RegionInstanceGroupClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.RegionInstanceGroupSettings`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.RegionInstanceGroupClient [^com.google.cloud.compute.v1.RegionInstanceGroupSettings settings]
    (RegionInstanceGroupClient/create settings))
  (^com.google.cloud.compute.v1.RegionInstanceGroupClient []
    (RegionInstanceGroupClient/create )))

(defn set-named-ports-region-instance-group-callable
  "Sets the named ports for the specified regional instance group.

   Sample code:



   try (RegionInstanceGroupClient regionInstanceGroupClient = RegionInstanceGroupClient.create()) {
     String formattedInstanceGroup = ProjectRegionInstanceGroupName.format(\"[PROJECT]\", \"[REGION]\", \"[INSTANCE_GROUP]\");
     RegionInstanceGroupsSetNamedPortsRequest regionInstanceGroupsSetNamedPortsRequestResource = RegionInstanceGroupsSetNamedPortsRequest.newBuilder().build();
     SetNamedPortsRegionInstanceGroupHttpRequest request = SetNamedPortsRegionInstanceGroupHttpRequest.newBuilder()
       .setInstanceGroup(formattedInstanceGroup)
       .setRegionInstanceGroupsSetNamedPortsRequestResource(regionInstanceGroupsSetNamedPortsRequestResource)
       .build();
     ApiFuture<Operation> future = regionInstanceGroupClient.setNamedPortsRegionInstanceGroupCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetNamedPortsRegionInstanceGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionInstanceGroupClient this]
    (-> this (.setNamedPortsRegionInstanceGroupCallable))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.RegionInstanceGroupSettings`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupSettings [^RegionInstanceGroupClient this]
    (-> this (.getSettings))))

(defn get-region-instance-group-callable
  "Returns the specified instance group resource.

   Sample code:



   try (RegionInstanceGroupClient regionInstanceGroupClient = RegionInstanceGroupClient.create()) {
     String formattedInstanceGroup = ProjectRegionInstanceGroupName.format(\"[PROJECT]\", \"[REGION]\", \"[INSTANCE_GROUP]\");
     GetRegionInstanceGroupHttpRequest request = GetRegionInstanceGroupHttpRequest.newBuilder()
       .setInstanceGroup(formattedInstanceGroup)
       .build();
     ApiFuture<InstanceGroup> future = regionInstanceGroupClient.getRegionInstanceGroupCallable().futureCall(request);
     // Do something
     InstanceGroup response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetRegionInstanceGroupHttpRequest,com.google.cloud.compute.v1.InstanceGroup>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionInstanceGroupClient this]
    (-> this (.getRegionInstanceGroupCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.RegionInstanceGroupStub`"
  ([^RegionInstanceGroupClient this]
    (-> this (.getStub))))

(defn list-region-instance-groups-callable
  "Retrieves the list of instance group resources contained within the specified region.

   Sample code:



   try (RegionInstanceGroupClient regionInstanceGroupClient = RegionInstanceGroupClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     ListRegionInstanceGroupsHttpRequest request = ListRegionInstanceGroupsHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .build();
     while (true) {
       RegionInstanceGroupList response = regionInstanceGroupClient.listRegionInstanceGroupsCallable().call(request);
       for (InstanceGroup element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionInstanceGroupsHttpRequest,com.google.cloud.compute.v1.RegionInstanceGroupList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionInstanceGroupClient this]
    (-> this (.listRegionInstanceGroupsCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^RegionInstanceGroupClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^RegionInstanceGroupClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn set-named-ports-region-instance-group
  "Sets the named ports for the specified regional instance group.

   Sample code:



   try (RegionInstanceGroupClient regionInstanceGroupClient = RegionInstanceGroupClient.create()) {
     ProjectRegionInstanceGroupName instanceGroup = ProjectRegionInstanceGroupName.of(\"[PROJECT]\", \"[REGION]\", \"[INSTANCE_GROUP]\");
     RegionInstanceGroupsSetNamedPortsRequest regionInstanceGroupsSetNamedPortsRequestResource = RegionInstanceGroupsSetNamedPortsRequest.newBuilder().build();
     Operation response = regionInstanceGroupClient.setNamedPortsRegionInstanceGroup(instanceGroup, regionInstanceGroupsSetNamedPortsRequestResource);
   }

  instance-group - The name of the regional instance group where the named ports are updated. - `com.google.cloud.compute.v1.ProjectRegionInstanceGroupName`
  region-instance-groups-set-named-ports-request-resource - `com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^RegionInstanceGroupClient this ^com.google.cloud.compute.v1.ProjectRegionInstanceGroupName instance-group ^com.google.cloud.compute.v1.RegionInstanceGroupsSetNamedPortsRequest region-instance-groups-set-named-ports-request-resource]
    (-> this (.setNamedPortsRegionInstanceGroup instance-group region-instance-groups-set-named-ports-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^RegionInstanceGroupClient this ^com.google.cloud.compute.v1.SetNamedPortsRegionInstanceGroupHttpRequest request]
    (-> this (.setNamedPortsRegionInstanceGroup request))))

(defn shutdown
  ""
  ([^RegionInstanceGroupClient this]
    (-> this (.shutdown))))

(defn list-region-instance-groups
  "Retrieves the list of instance group resources contained within the specified region.

   Sample code:



   try (RegionInstanceGroupClient regionInstanceGroupClient = RegionInstanceGroupClient.create()) {
     ProjectRegionName region = ProjectRegionName.of(\"[PROJECT]\", \"[REGION]\");
     for (InstanceGroup element : regionInstanceGroupClient.listRegionInstanceGroups(region).iterateAll()) {
       // doThingsWith(element);
     }
   }

  region - Name of the region scoping this request. - `com.google.cloud.compute.v1.ProjectRegionName`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupClient$ListRegionInstanceGroupsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.RegionInstanceGroupClient$ListRegionInstanceGroupsPagedResponse [^RegionInstanceGroupClient this ^com.google.cloud.compute.v1.ProjectRegionName region]
    (-> this (.listRegionInstanceGroups region))))

(defn list-instances-region-instance-groups-paged-callable
  "Lists the instances in the specified instance group and displays information about the named
   ports. Depending on the specified options, this method can list all instances or only the
   instances that are running.

   Sample code:



   try (RegionInstanceGroupClient regionInstanceGroupClient = RegionInstanceGroupClient.create()) {
     String formattedInstanceGroup = ProjectRegionInstanceGroupName.format(\"[PROJECT]\", \"[REGION]\", \"[INSTANCE_GROUP]\");
     RegionInstanceGroupsListInstancesRequest regionInstanceGroupsListInstancesRequestResource = RegionInstanceGroupsListInstancesRequest.newBuilder().build();
     ListInstancesRegionInstanceGroupsHttpRequest request = ListInstancesRegionInstanceGroupsHttpRequest.newBuilder()
       .setInstanceGroup(formattedInstanceGroup)
       .setRegionInstanceGroupsListInstancesRequestResource(regionInstanceGroupsListInstancesRequestResource)
       .build();
     ApiFuture<ListInstancesRegionInstanceGroupsPagedResponse> future = regionInstanceGroupClient.listInstancesRegionInstanceGroupsPagedCallable().futureCall(request);
     // Do something
     for (InstanceWithNamedPorts element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInstancesRegionInstanceGroupsHttpRequest,com.google.cloud.compute.v1.RegionInstanceGroupClient$ListInstancesRegionInstanceGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionInstanceGroupClient this]
    (-> this (.listInstancesRegionInstanceGroupsPagedCallable))))

(defn close
  ""
  ([^RegionInstanceGroupClient this]
    (-> this (.close))))

(defn list-instances-region-instance-groups
  "Lists the instances in the specified instance group and displays information about the named
   ports. Depending on the specified options, this method can list all instances or only the
   instances that are running.

   Sample code:



   try (RegionInstanceGroupClient regionInstanceGroupClient = RegionInstanceGroupClient.create()) {
     ProjectRegionInstanceGroupName instanceGroup = ProjectRegionInstanceGroupName.of(\"[PROJECT]\", \"[REGION]\", \"[INSTANCE_GROUP]\");
     RegionInstanceGroupsListInstancesRequest regionInstanceGroupsListInstancesRequestResource = RegionInstanceGroupsListInstancesRequest.newBuilder().build();
     for (InstanceWithNamedPorts element : regionInstanceGroupClient.listInstancesRegionInstanceGroups(instanceGroup, regionInstanceGroupsListInstancesRequestResource).iterateAll()) {
       // doThingsWith(element);
     }
   }

  instance-group - Name of the regional instance group for which we want to list the instances. - `com.google.cloud.compute.v1.ProjectRegionInstanceGroupName`
  region-instance-groups-list-instances-request-resource - `com.google.cloud.compute.v1.RegionInstanceGroupsListInstancesRequest`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupClient$ListInstancesRegionInstanceGroupsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.RegionInstanceGroupClient$ListInstancesRegionInstanceGroupsPagedResponse [^RegionInstanceGroupClient this ^com.google.cloud.compute.v1.ProjectRegionInstanceGroupName instance-group ^com.google.cloud.compute.v1.RegionInstanceGroupsListInstancesRequest region-instance-groups-list-instances-request-resource]
    (-> this (.listInstancesRegionInstanceGroups instance-group region-instance-groups-list-instances-request-resource)))
  (^com.google.cloud.compute.v1.RegionInstanceGroupClient$ListInstancesRegionInstanceGroupsPagedResponse [^RegionInstanceGroupClient this ^com.google.cloud.compute.v1.ListInstancesRegionInstanceGroupsHttpRequest request]
    (-> this (.listInstancesRegionInstanceGroups request))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^RegionInstanceGroupClient this]
    (-> this (.isTerminated))))

(defn list-instances-region-instance-groups-callable
  "Lists the instances in the specified instance group and displays information about the named
   ports. Depending on the specified options, this method can list all instances or only the
   instances that are running.

   Sample code:



   try (RegionInstanceGroupClient regionInstanceGroupClient = RegionInstanceGroupClient.create()) {
     String formattedInstanceGroup = ProjectRegionInstanceGroupName.format(\"[PROJECT]\", \"[REGION]\", \"[INSTANCE_GROUP]\");
     RegionInstanceGroupsListInstancesRequest regionInstanceGroupsListInstancesRequestResource = RegionInstanceGroupsListInstancesRequest.newBuilder().build();
     ListInstancesRegionInstanceGroupsHttpRequest request = ListInstancesRegionInstanceGroupsHttpRequest.newBuilder()
       .setInstanceGroup(formattedInstanceGroup)
       .setRegionInstanceGroupsListInstancesRequestResource(regionInstanceGroupsListInstancesRequestResource)
       .build();
     while (true) {
       RegionInstanceGroupsListInstances response = regionInstanceGroupClient.listInstancesRegionInstanceGroupsCallable().call(request);
       for (InstanceWithNamedPorts element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInstancesRegionInstanceGroupsHttpRequest,com.google.cloud.compute.v1.RegionInstanceGroupsListInstances>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionInstanceGroupClient this]
    (-> this (.listInstancesRegionInstanceGroupsCallable))))

(defn get-region-instance-group
  "Returns the specified instance group resource.

   Sample code:



   try (RegionInstanceGroupClient regionInstanceGroupClient = RegionInstanceGroupClient.create()) {
     ProjectRegionInstanceGroupName instanceGroup = ProjectRegionInstanceGroupName.of(\"[PROJECT]\", \"[REGION]\", \"[INSTANCE_GROUP]\");
     InstanceGroup response = regionInstanceGroupClient.getRegionInstanceGroup(instanceGroup);
   }

  instance-group - Name of the instance group resource to return. - `com.google.cloud.compute.v1.ProjectRegionInstanceGroupName`

  returns: `com.google.cloud.compute.v1.InstanceGroup`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.InstanceGroup [^RegionInstanceGroupClient this ^com.google.cloud.compute.v1.ProjectRegionInstanceGroupName instance-group]
    (-> this (.getRegionInstanceGroup instance-group))))

(defn shutdown-now
  ""
  ([^RegionInstanceGroupClient this]
    (-> this (.shutdownNow))))

(defn list-region-instance-groups-paged-callable
  "Retrieves the list of instance group resources contained within the specified region.

   Sample code:



   try (RegionInstanceGroupClient regionInstanceGroupClient = RegionInstanceGroupClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     ListRegionInstanceGroupsHttpRequest request = ListRegionInstanceGroupsHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .build();
     ApiFuture<ListRegionInstanceGroupsPagedResponse> future = regionInstanceGroupClient.listRegionInstanceGroupsPagedCallable().futureCall(request);
     // Do something
     for (InstanceGroup element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionInstanceGroupsHttpRequest,com.google.cloud.compute.v1.RegionInstanceGroupClient$ListRegionInstanceGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionInstanceGroupClient this]
    (-> this (.listRegionInstanceGroupsPagedCallable))))

