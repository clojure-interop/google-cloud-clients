(ns com.google.cloud.compute.v1.InstanceGroupClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
    ProjectZoneInstanceGroupName instanceGroup = ProjectZoneInstanceGroupName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE_GROUP]\");
    InstanceGroupsAddInstancesRequest instanceGroupsAddInstancesRequestResource = InstanceGroupsAddInstancesRequest.newBuilder().build();
    Operation response = instanceGroupClient.addInstancesInstanceGroup(instanceGroup, instanceGroupsAddInstancesRequestResource);
  }

  Note: close() needs to be called on the instanceGroupClient object to clean up resources such
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

  This class can be customized by passing in a custom instance of InstanceGroupSettings to
  create(). For example:

  To customize credentials:



  InstanceGroupSettings instanceGroupSettings =
      InstanceGroupSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  InstanceGroupClient instanceGroupClient =
      InstanceGroupClient.create(instanceGroupSettings);

  To customize the endpoint:



  InstanceGroupSettings instanceGroupSettings =
      InstanceGroupSettings.newBuilder().setEndpoint(myEndpoint).build();
  InstanceGroupClient instanceGroupClient =
      InstanceGroupClient.create(instanceGroupSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupClient]))

(defn *create
  "Constructs an instance of InstanceGroupClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.InstanceGroupSettings`

  returns: `com.google.cloud.compute.v1.InstanceGroupClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.InstanceGroupClient [^com.google.cloud.compute.v1.InstanceGroupSettings settings]
    (InstanceGroupClient/create settings))
  (^com.google.cloud.compute.v1.InstanceGroupClient []
    (InstanceGroupClient/create )))

(defn delete-instance-group-callable
  "Deletes the specified instance group. The instances in the group are not deleted. Note that
   instance group must not belong to a backend service. Read Deleting an instance group for more
   information.

   Sample code:



   try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
     String formattedInstanceGroup = ProjectZoneInstanceGroupName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE_GROUP]\");
     DeleteInstanceGroupHttpRequest request = DeleteInstanceGroupHttpRequest.newBuilder()
       .setInstanceGroup(formattedInstanceGroup)
       .build();
     ApiFuture<Operation> future = instanceGroupClient.deleteInstanceGroupCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteInstanceGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupClient this]
    (-> this (.deleteInstanceGroupCallable))))

(defn list-instances-instance-groups-callable
  "Lists the instances in the specified instance group.

   Sample code:



   try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
     String formattedInstanceGroup = ProjectZoneInstanceGroupName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE_GROUP]\");
     InstanceGroupsListInstancesRequest instanceGroupsListInstancesRequestResource = InstanceGroupsListInstancesRequest.newBuilder().build();
     ListInstancesInstanceGroupsHttpRequest request = ListInstancesInstanceGroupsHttpRequest.newBuilder()
       .setInstanceGroup(formattedInstanceGroup)
       .setInstanceGroupsListInstancesRequestResource(instanceGroupsListInstancesRequestResource)
       .build();
     while (true) {
       InstanceGroupsListInstances response = instanceGroupClient.listInstancesInstanceGroupsCallable().call(request);
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInstancesInstanceGroupsHttpRequest,com.google.cloud.compute.v1.InstanceGroupsListInstances>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupClient this]
    (-> this (.listInstancesInstanceGroupsCallable))))

(defn get-instance-group
  "Returns the specified instance group. Gets a list of available instance groups by making a
   list() request.

   Sample code:



   try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
     ProjectZoneInstanceGroupName instanceGroup = ProjectZoneInstanceGroupName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE_GROUP]\");
     InstanceGroup response = instanceGroupClient.getInstanceGroup(instanceGroup);
   }

  instance-group - The name of the instance group. - `com.google.cloud.compute.v1.ProjectZoneInstanceGroupName`

  returns: `com.google.cloud.compute.v1.InstanceGroup`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.InstanceGroup [^InstanceGroupClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceGroupName instance-group]
    (-> this (.getInstanceGroup instance-group))))

(defn get-instance-group-callable
  "Returns the specified instance group. Gets a list of available instance groups by making a
   list() request.

   Sample code:



   try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
     String formattedInstanceGroup = ProjectZoneInstanceGroupName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE_GROUP]\");
     GetInstanceGroupHttpRequest request = GetInstanceGroupHttpRequest.newBuilder()
       .setInstanceGroup(formattedInstanceGroup)
       .build();
     ApiFuture<InstanceGroup> future = instanceGroupClient.getInstanceGroupCallable().futureCall(request);
     // Do something
     InstanceGroup response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetInstanceGroupHttpRequest,com.google.cloud.compute.v1.InstanceGroup>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupClient this]
    (-> this (.getInstanceGroupCallable))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.InstanceGroupSettings`"
  (^com.google.cloud.compute.v1.InstanceGroupSettings [^InstanceGroupClient this]
    (-> this (.getSettings))))

(defn list-instance-groups
  "Retrieves the list of instance groups that are located in the specified project and zone.

   Sample code:



   try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
     ProjectZoneName zone = ProjectZoneName.of(\"[PROJECT]\", \"[ZONE]\");
     for (InstanceGroup element : instanceGroupClient.listInstanceGroups(zone).iterateAll()) {
       // doThingsWith(element);
     }
   }

  zone - The name of the zone where the instance group is located. - `com.google.cloud.compute.v1.ProjectZoneName`

  returns: `com.google.cloud.compute.v1.InstanceGroupClient$ListInstanceGroupsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.InstanceGroupClient$ListInstanceGroupsPagedResponse [^InstanceGroupClient this ^com.google.cloud.compute.v1.ProjectZoneName zone]
    (-> this (.listInstanceGroups zone))))

(defn list-instances-instance-groups
  "Lists the instances in the specified instance group.

   Sample code:



   try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
     ProjectZoneInstanceGroupName instanceGroup = ProjectZoneInstanceGroupName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE_GROUP]\");
     InstanceGroupsListInstancesRequest instanceGroupsListInstancesRequestResource = InstanceGroupsListInstancesRequest.newBuilder().build();
     for (InstanceWithNamedPorts element : instanceGroupClient.listInstancesInstanceGroups(instanceGroup, instanceGroupsListInstancesRequestResource).iterateAll()) {
       // doThingsWith(element);
     }
   }

  instance-group - The name of the instance group from which you want to generate a list of included instances. - `com.google.cloud.compute.v1.ProjectZoneInstanceGroupName`
  instance-groups-list-instances-request-resource - `com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest`

  returns: `com.google.cloud.compute.v1.InstanceGroupClient$ListInstancesInstanceGroupsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.InstanceGroupClient$ListInstancesInstanceGroupsPagedResponse [^InstanceGroupClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceGroupName instance-group ^com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest instance-groups-list-instances-request-resource]
    (-> this (.listInstancesInstanceGroups instance-group instance-groups-list-instances-request-resource)))
  (^com.google.cloud.compute.v1.InstanceGroupClient$ListInstancesInstanceGroupsPagedResponse [^InstanceGroupClient this ^com.google.cloud.compute.v1.ListInstancesInstanceGroupsHttpRequest request]
    (-> this (.listInstancesInstanceGroups request))))

(defn list-instance-groups-callable
  "Retrieves the list of instance groups that are located in the specified project and zone.

   Sample code:



   try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
     String formattedZone = ProjectZoneName.format(\"[PROJECT]\", \"[ZONE]\");
     ListInstanceGroupsHttpRequest request = ListInstanceGroupsHttpRequest.newBuilder()
       .setZone(formattedZone)
       .build();
     while (true) {
       InstanceGroupList response = instanceGroupClient.listInstanceGroupsCallable().call(request);
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInstanceGroupsHttpRequest,com.google.cloud.compute.v1.InstanceGroupList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupClient this]
    (-> this (.listInstanceGroupsCallable))))

(defn list-instance-groups-paged-callable
  "Retrieves the list of instance groups that are located in the specified project and zone.

   Sample code:



   try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
     String formattedZone = ProjectZoneName.format(\"[PROJECT]\", \"[ZONE]\");
     ListInstanceGroupsHttpRequest request = ListInstanceGroupsHttpRequest.newBuilder()
       .setZone(formattedZone)
       .build();
     ApiFuture<ListInstanceGroupsPagedResponse> future = instanceGroupClient.listInstanceGroupsPagedCallable().futureCall(request);
     // Do something
     for (InstanceGroup element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInstanceGroupsHttpRequest,com.google.cloud.compute.v1.InstanceGroupClient$ListInstanceGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupClient this]
    (-> this (.listInstanceGroupsPagedCallable))))

(defn add-instances-instance-group-callable
  "Adds a list of instances to the specified instance group. All of the instances in the instance
   group must be in the same network/subnetwork. Read Adding instances for more information.

   Sample code:



   try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
     String formattedInstanceGroup = ProjectZoneInstanceGroupName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE_GROUP]\");
     InstanceGroupsAddInstancesRequest instanceGroupsAddInstancesRequestResource = InstanceGroupsAddInstancesRequest.newBuilder().build();
     AddInstancesInstanceGroupHttpRequest request = AddInstancesInstanceGroupHttpRequest.newBuilder()
       .setInstanceGroup(formattedInstanceGroup)
       .setInstanceGroupsAddInstancesRequestResource(instanceGroupsAddInstancesRequestResource)
       .build();
     ApiFuture<Operation> future = instanceGroupClient.addInstancesInstanceGroupCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AddInstancesInstanceGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupClient this]
    (-> this (.addInstancesInstanceGroupCallable))))

(defn aggregated-list-instance-groups-callable
  "Retrieves the list of instance groups and sorts them by zone.

   Sample code:



   try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListInstanceGroupsHttpRequest request = AggregatedListInstanceGroupsHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       InstanceGroupAggregatedList response = instanceGroupClient.aggregatedListInstanceGroupsCallable().call(request);
       for (InstanceGroupsScopedList element : response.getItemsMap()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListInstanceGroupsHttpRequest,com.google.cloud.compute.v1.InstanceGroupAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupClient this]
    (-> this (.aggregatedListInstanceGroupsCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.InstanceGroupStub`"
  ([^InstanceGroupClient this]
    (-> this (.getStub))))

(defn delete-instance-group
  "Deletes the specified instance group. The instances in the group are not deleted. Note that
   instance group must not belong to a backend service. Read Deleting an instance group for more
   information.

   Sample code:



   try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
     ProjectZoneInstanceGroupName instanceGroup = ProjectZoneInstanceGroupName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE_GROUP]\");
     Operation response = instanceGroupClient.deleteInstanceGroup(instanceGroup);
   }

  instance-group - The name of the instance group to delete. - `com.google.cloud.compute.v1.ProjectZoneInstanceGroupName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceGroupClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceGroupName instance-group]
    (-> this (.deleteInstanceGroup instance-group))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^InstanceGroupClient this]
    (-> this (.isShutdown))))

(defn add-instances-instance-group
  "Adds a list of instances to the specified instance group. All of the instances in the instance
   group must be in the same network/subnetwork. Read Adding instances for more information.

   Sample code:



   try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
     ProjectZoneInstanceGroupName instanceGroup = ProjectZoneInstanceGroupName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE_GROUP]\");
     InstanceGroupsAddInstancesRequest instanceGroupsAddInstancesRequestResource = InstanceGroupsAddInstancesRequest.newBuilder().build();
     Operation response = instanceGroupClient.addInstancesInstanceGroup(instanceGroup, instanceGroupsAddInstancesRequestResource);
   }

  instance-group - The name of the instance group where you are adding instances. - `com.google.cloud.compute.v1.ProjectZoneInstanceGroupName`
  instance-groups-add-instances-request-resource - `com.google.cloud.compute.v1.InstanceGroupsAddInstancesRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceGroupClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceGroupName instance-group ^com.google.cloud.compute.v1.InstanceGroupsAddInstancesRequest instance-groups-add-instances-request-resource]
    (-> this (.addInstancesInstanceGroup instance-group instance-groups-add-instances-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^InstanceGroupClient this ^com.google.cloud.compute.v1.AddInstancesInstanceGroupHttpRequest request]
    (-> this (.addInstancesInstanceGroup request))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^InstanceGroupClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^InstanceGroupClient this]
    (-> this (.shutdown))))

(defn remove-instances-instance-group
  "Removes one or more instances from the specified instance group, but does not delete those
   instances.

   If the group is part of a backend service that has enabled connection draining, it can take
   up to 60 seconds after the connection draining duration before the VM instance is removed or
   deleted.

   Sample code:



   try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
     ProjectZoneInstanceGroupName instanceGroup = ProjectZoneInstanceGroupName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE_GROUP]\");
     InstanceGroupsRemoveInstancesRequest instanceGroupsRemoveInstancesRequestResource = InstanceGroupsRemoveInstancesRequest.newBuilder().build();
     Operation response = instanceGroupClient.removeInstancesInstanceGroup(instanceGroup, instanceGroupsRemoveInstancesRequestResource);
   }

  instance-group - The name of the instance group where the specified instances will be removed. - `com.google.cloud.compute.v1.ProjectZoneInstanceGroupName`
  instance-groups-remove-instances-request-resource - `com.google.cloud.compute.v1.InstanceGroupsRemoveInstancesRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceGroupClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceGroupName instance-group ^com.google.cloud.compute.v1.InstanceGroupsRemoveInstancesRequest instance-groups-remove-instances-request-resource]
    (-> this (.removeInstancesInstanceGroup instance-group instance-groups-remove-instances-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^InstanceGroupClient this ^com.google.cloud.compute.v1.RemoveInstancesInstanceGroupHttpRequest request]
    (-> this (.removeInstancesInstanceGroup request))))

(defn aggregated-list-instance-groups-paged-callable
  "Retrieves the list of instance groups and sorts them by zone.

   Sample code:



   try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListInstanceGroupsHttpRequest request = AggregatedListInstanceGroupsHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<AggregatedListInstanceGroupsPagedResponse> future = instanceGroupClient.aggregatedListInstanceGroupsPagedCallable().futureCall(request);
     // Do something
     for (InstanceGroupsScopedList element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListInstanceGroupsHttpRequest,com.google.cloud.compute.v1.InstanceGroupClient$AggregatedListInstanceGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupClient this]
    (-> this (.aggregatedListInstanceGroupsPagedCallable))))

(defn close
  ""
  ([^InstanceGroupClient this]
    (-> this (.close))))

(defn insert-instance-group-callable
  "Creates an instance group in the specified project using the parameters that are included in
   the request.

   Sample code:



   try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
     String formattedZone = ProjectZoneName.format(\"[PROJECT]\", \"[ZONE]\");
     InstanceGroup instanceGroupResource = InstanceGroup.newBuilder().build();
     InsertInstanceGroupHttpRequest request = InsertInstanceGroupHttpRequest.newBuilder()
       .setZone(formattedZone)
       .setInstanceGroupResource(instanceGroupResource)
       .build();
     ApiFuture<Operation> future = instanceGroupClient.insertInstanceGroupCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertInstanceGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupClient this]
    (-> this (.insertInstanceGroupCallable))))

(defn list-instances-instance-groups-paged-callable
  "Lists the instances in the specified instance group.

   Sample code:



   try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
     String formattedInstanceGroup = ProjectZoneInstanceGroupName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE_GROUP]\");
     InstanceGroupsListInstancesRequest instanceGroupsListInstancesRequestResource = InstanceGroupsListInstancesRequest.newBuilder().build();
     ListInstancesInstanceGroupsHttpRequest request = ListInstancesInstanceGroupsHttpRequest.newBuilder()
       .setInstanceGroup(formattedInstanceGroup)
       .setInstanceGroupsListInstancesRequestResource(instanceGroupsListInstancesRequestResource)
       .build();
     ApiFuture<ListInstancesInstanceGroupsPagedResponse> future = instanceGroupClient.listInstancesInstanceGroupsPagedCallable().futureCall(request);
     // Do something
     for (InstanceWithNamedPorts element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInstancesInstanceGroupsHttpRequest,com.google.cloud.compute.v1.InstanceGroupClient$ListInstancesInstanceGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupClient this]
    (-> this (.listInstancesInstanceGroupsPagedCallable))))

(defn set-named-ports-instance-group
  "Sets the named ports for the specified instance group.

   Sample code:



   try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
     ProjectZoneInstanceGroupName instanceGroup = ProjectZoneInstanceGroupName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE_GROUP]\");
     InstanceGroupsSetNamedPortsRequest instanceGroupsSetNamedPortsRequestResource = InstanceGroupsSetNamedPortsRequest.newBuilder().build();
     Operation response = instanceGroupClient.setNamedPortsInstanceGroup(instanceGroup, instanceGroupsSetNamedPortsRequestResource);
   }

  instance-group - The name of the instance group where the named ports are updated. - `com.google.cloud.compute.v1.ProjectZoneInstanceGroupName`
  instance-groups-set-named-ports-request-resource - `com.google.cloud.compute.v1.InstanceGroupsSetNamedPortsRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceGroupClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceGroupName instance-group ^com.google.cloud.compute.v1.InstanceGroupsSetNamedPortsRequest instance-groups-set-named-ports-request-resource]
    (-> this (.setNamedPortsInstanceGroup instance-group instance-groups-set-named-ports-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^InstanceGroupClient this ^com.google.cloud.compute.v1.SetNamedPortsInstanceGroupHttpRequest request]
    (-> this (.setNamedPortsInstanceGroup request))))

(defn aggregated-list-instance-groups
  "Retrieves the list of instance groups and sorts them by zone.

   Sample code:



   try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (InstanceGroupsScopedList element : instanceGroupClient.aggregatedListInstanceGroups(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.InstanceGroupClient$AggregatedListInstanceGroupsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.InstanceGroupClient$AggregatedListInstanceGroupsPagedResponse [^InstanceGroupClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.aggregatedListInstanceGroups project))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^InstanceGroupClient this]
    (-> this (.isTerminated))))

(defn remove-instances-instance-group-callable
  "Removes one or more instances from the specified instance group, but does not delete those
   instances.

   If the group is part of a backend service that has enabled connection draining, it can take
   up to 60 seconds after the connection draining duration before the VM instance is removed or
   deleted.

   Sample code:



   try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
     String formattedInstanceGroup = ProjectZoneInstanceGroupName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE_GROUP]\");
     InstanceGroupsRemoveInstancesRequest instanceGroupsRemoveInstancesRequestResource = InstanceGroupsRemoveInstancesRequest.newBuilder().build();
     RemoveInstancesInstanceGroupHttpRequest request = RemoveInstancesInstanceGroupHttpRequest.newBuilder()
       .setInstanceGroup(formattedInstanceGroup)
       .setInstanceGroupsRemoveInstancesRequestResource(instanceGroupsRemoveInstancesRequestResource)
       .build();
     ApiFuture<Operation> future = instanceGroupClient.removeInstancesInstanceGroupCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.RemoveInstancesInstanceGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupClient this]
    (-> this (.removeInstancesInstanceGroupCallable))))

(defn set-named-ports-instance-group-callable
  "Sets the named ports for the specified instance group.

   Sample code:



   try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
     String formattedInstanceGroup = ProjectZoneInstanceGroupName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE_GROUP]\");
     InstanceGroupsSetNamedPortsRequest instanceGroupsSetNamedPortsRequestResource = InstanceGroupsSetNamedPortsRequest.newBuilder().build();
     SetNamedPortsInstanceGroupHttpRequest request = SetNamedPortsInstanceGroupHttpRequest.newBuilder()
       .setInstanceGroup(formattedInstanceGroup)
       .setInstanceGroupsSetNamedPortsRequestResource(instanceGroupsSetNamedPortsRequestResource)
       .build();
     ApiFuture<Operation> future = instanceGroupClient.setNamedPortsInstanceGroupCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetNamedPortsInstanceGroupHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupClient this]
    (-> this (.setNamedPortsInstanceGroupCallable))))

(defn shutdown-now
  ""
  ([^InstanceGroupClient this]
    (-> this (.shutdownNow))))

(defn insert-instance-group
  "Creates an instance group in the specified project using the parameters that are included in
   the request.

   Sample code:



   try (InstanceGroupClient instanceGroupClient = InstanceGroupClient.create()) {
     ProjectZoneName zone = ProjectZoneName.of(\"[PROJECT]\", \"[ZONE]\");
     InstanceGroup instanceGroupResource = InstanceGroup.newBuilder().build();
     Operation response = instanceGroupClient.insertInstanceGroup(zone, instanceGroupResource);
   }

  zone - The name of the zone where you want to create the instance group. - `com.google.cloud.compute.v1.ProjectZoneName`
  instance-group-resource - InstanceGroups (== resource_for beta.instanceGroups ==) (== resource_for v1.instanceGroups ==) (== resource_for beta.regionInstanceGroups ==) (== resource_for v1.regionInstanceGroups ==) - `com.google.cloud.compute.v1.InstanceGroup`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceGroupClient this ^com.google.cloud.compute.v1.ProjectZoneName zone ^com.google.cloud.compute.v1.InstanceGroup instance-group-resource]
    (-> this (.insertInstanceGroup zone instance-group-resource)))
  (^com.google.cloud.compute.v1.Operation [^InstanceGroupClient this ^com.google.cloud.compute.v1.InsertInstanceGroupHttpRequest request]
    (-> this (.insertInstanceGroup request))))

