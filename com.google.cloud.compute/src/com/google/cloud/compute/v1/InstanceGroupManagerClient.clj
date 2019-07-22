(ns com.google.cloud.compute.v1.InstanceGroupManagerClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (InstanceGroupManagerClient instanceGroupManagerClient = InstanceGroupManagerClient.create()) {
    ProjectZoneInstanceGroupManagerName instanceGroupManager = ProjectZoneInstanceGroupManagerName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE_GROUP_MANAGER]\");
    InstanceGroupManagersAbandonInstancesRequest instanceGroupManagersAbandonInstancesRequestResource = InstanceGroupManagersAbandonInstancesRequest.newBuilder().build();
    Operation response = instanceGroupManagerClient.abandonInstancesInstanceGroupManager(instanceGroupManager, instanceGroupManagersAbandonInstancesRequestResource);
  }

  Note: close() needs to be called on the instanceGroupManagerClient object to clean up
  resources such as threads. In the example above, try-with-resources is used, which automatically
  calls close().

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

  This class can be customized by passing in a custom instance of InstanceGroupManagerSettings
  to create(). For example:

  To customize credentials:



  InstanceGroupManagerSettings instanceGroupManagerSettings =
      InstanceGroupManagerSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  InstanceGroupManagerClient instanceGroupManagerClient =
      InstanceGroupManagerClient.create(instanceGroupManagerSettings);

  To customize the endpoint:



  InstanceGroupManagerSettings instanceGroupManagerSettings =
      InstanceGroupManagerSettings.newBuilder().setEndpoint(myEndpoint).build();
  InstanceGroupManagerClient instanceGroupManagerClient =
      InstanceGroupManagerClient.create(instanceGroupManagerSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupManagerClient]))

(defn *create
  "Constructs an instance of InstanceGroupManagerClient, using the given settings. The channels
   are created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.InstanceGroupManagerSettings`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.InstanceGroupManagerClient [^com.google.cloud.compute.v1.InstanceGroupManagerSettings settings]
    (InstanceGroupManagerClient/create settings))
  (^com.google.cloud.compute.v1.InstanceGroupManagerClient []
    (InstanceGroupManagerClient/create )))

(defn delete-instances-instance-group-manager
  "Flags the specified instances in the managed instance group for immediate deletion. The
   instances are also removed from any target pools of which they were a member. This method
   reduces the targetSize of the managed instance group by the number of instances that you
   delete. This operation is marked as DONE when the action is scheduled even if the instances are
   still being deleted. You must separately verify the status of the deleting action with the
   listmanagedinstances method.

   If the group is part of a backend service that has enabled connection draining, it can take
   up to 60 seconds after the connection draining duration has elapsed before the VM instance is
   removed or deleted.

   You can specify a maximum of 1000 instances with this method per request.

   Sample code:



   try (InstanceGroupManagerClient instanceGroupManagerClient = InstanceGroupManagerClient.create()) {
     ProjectZoneInstanceGroupManagerName instanceGroupManager = ProjectZoneInstanceGroupManagerName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE_GROUP_MANAGER]\");
     InstanceGroupManagersDeleteInstancesRequest instanceGroupManagersDeleteInstancesRequestResource = InstanceGroupManagersDeleteInstancesRequest.newBuilder().build();
     Operation response = instanceGroupManagerClient.deleteInstancesInstanceGroupManager(instanceGroupManager, instanceGroupManagersDeleteInstancesRequestResource);
   }

  instance-group-manager - The name of the managed instance group. - `com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName`
  instance-group-managers-delete-instances-request-resource - `com.google.cloud.compute.v1.InstanceGroupManagersDeleteInstancesRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceGroupManagerClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName instance-group-manager ^com.google.cloud.compute.v1.InstanceGroupManagersDeleteInstancesRequest instance-group-managers-delete-instances-request-resource]
    (-> this (.deleteInstancesInstanceGroupManager instance-group-manager instance-group-managers-delete-instances-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^InstanceGroupManagerClient this ^com.google.cloud.compute.v1.DeleteInstancesInstanceGroupManagerHttpRequest request]
    (-> this (.deleteInstancesInstanceGroupManager request))))

(defn resize-instance-group-manager
  "Resizes the managed instance group. If you increase the size, the group creates new instances
   using the current instance template. If you decrease the size, the group deletes instances. The
   resize operation is marked DONE when the resize actions are scheduled even if the group has not
   yet added or deleted any instances. You must separately verify the status of the creating or
   deleting actions with the listmanagedinstances method.

   When resizing down, the instance group arbitrarily chooses the order in which VMs are
   deleted. The group takes into account some VM attributes when making the selection including:

   + The status of the VM instance.  The health of the VM instance.  The instance template
   version the VM is based on.  For regional managed instance groups, the location of the VM
   instance.

   This list is subject to change.

   If the group is part of a backend service that has enabled connection draining, it can take
   up to 60 seconds after the connection draining duration has elapsed before the VM instance is
   removed or deleted.

   Sample code:



   try (InstanceGroupManagerClient instanceGroupManagerClient = InstanceGroupManagerClient.create()) {
     Integer size = 0;
     ProjectZoneInstanceGroupManagerName instanceGroupManager = ProjectZoneInstanceGroupManagerName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE_GROUP_MANAGER]\");
     Operation response = instanceGroupManagerClient.resizeInstanceGroupManager(size, instanceGroupManager);
   }

  size - The number of running instances that the managed instance group should maintain at any given time. The group automatically adds or removes instances to maintain the number of instances specified by this parameter. - `java.lang.Integer`
  instance-group-manager - The name of the managed instance group. - `com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceGroupManagerClient this ^java.lang.Integer size ^com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName instance-group-manager]
    (-> this (.resizeInstanceGroupManager size instance-group-manager)))
  (^com.google.cloud.compute.v1.Operation [^InstanceGroupManagerClient this ^com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest request]
    (-> this (.resizeInstanceGroupManager request))))

(defn set-target-pools-instance-group-manager
  "Modifies the target pools to which all instances in this managed instance group are assigned.
   The target pools automatically apply to all of the instances in the managed instance group.
   This operation is marked DONE when you make the request even if the instances have not yet been
   added to their target pools. The change might take some time to apply to all of the instances
   in the group depending on the size of the group.

   Sample code:



   try (InstanceGroupManagerClient instanceGroupManagerClient = InstanceGroupManagerClient.create()) {
     ProjectZoneInstanceGroupManagerName instanceGroupManager = ProjectZoneInstanceGroupManagerName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE_GROUP_MANAGER]\");
     InstanceGroupManagersSetTargetPoolsRequest instanceGroupManagersSetTargetPoolsRequestResource = InstanceGroupManagersSetTargetPoolsRequest.newBuilder().build();
     Operation response = instanceGroupManagerClient.setTargetPoolsInstanceGroupManager(instanceGroupManager, instanceGroupManagersSetTargetPoolsRequestResource);
   }

  instance-group-manager - The name of the managed instance group. - `com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName`
  instance-group-managers-set-target-pools-request-resource - `com.google.cloud.compute.v1.InstanceGroupManagersSetTargetPoolsRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceGroupManagerClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName instance-group-manager ^com.google.cloud.compute.v1.InstanceGroupManagersSetTargetPoolsRequest instance-group-managers-set-target-pools-request-resource]
    (-> this (.setTargetPoolsInstanceGroupManager instance-group-manager instance-group-managers-set-target-pools-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^InstanceGroupManagerClient this ^com.google.cloud.compute.v1.SetTargetPoolsInstanceGroupManagerHttpRequest request]
    (-> this (.setTargetPoolsInstanceGroupManager request))))

(defn list-instance-group-managers
  "Retrieves a list of managed instance groups that are contained within the specified project and
   zone.

   Sample code:



   try (InstanceGroupManagerClient instanceGroupManagerClient = InstanceGroupManagerClient.create()) {
     ProjectZoneName zone = ProjectZoneName.of(\"[PROJECT]\", \"[ZONE]\");
     for (InstanceGroupManager element : instanceGroupManagerClient.listInstanceGroupManagers(zone).iterateAll()) {
       // doThingsWith(element);
     }
   }

  zone - The name of the zone where the managed instance group is located. - `com.google.cloud.compute.v1.ProjectZoneName`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerClient$ListInstanceGroupManagersPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.InstanceGroupManagerClient$ListInstanceGroupManagersPagedResponse [^InstanceGroupManagerClient this ^com.google.cloud.compute.v1.ProjectZoneName zone]
    (-> this (.listInstanceGroupManagers zone))))

(defn delete-instance-group-manager-callable
  "Deletes the specified managed instance group and all of the instances in that group. Note that
   the instance group must not belong to a backend service. Read Deleting an instance group for
   more information.

   Sample code:



   try (InstanceGroupManagerClient instanceGroupManagerClient = InstanceGroupManagerClient.create()) {
     String formattedInstanceGroupManager = ProjectZoneInstanceGroupManagerName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE_GROUP_MANAGER]\");
     DeleteInstanceGroupManagerHttpRequest request = DeleteInstanceGroupManagerHttpRequest.newBuilder()
       .setInstanceGroupManager(formattedInstanceGroupManager)
       .build();
     ApiFuture<Operation> future = instanceGroupManagerClient.deleteInstanceGroupManagerCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupManagerClient this]
    (-> this (.deleteInstanceGroupManagerCallable))))

(defn list-managed-instances-instance-group-managers
  "Lists all of the instances in the managed instance group. Each instance in the list has a
   currentAction, which indicates the action that the managed instance group is performing on the
   instance. For example, if the group is still creating an instance, the currentAction is
   CREATING. If a previous action failed, the list displays the errors for that failed action.

   Sample code:



   try (InstanceGroupManagerClient instanceGroupManagerClient = InstanceGroupManagerClient.create()) {
     ProjectZoneInstanceGroupManagerName instanceGroupManager = ProjectZoneInstanceGroupManagerName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE_GROUP_MANAGER]\");
     InstanceGroupManagersListManagedInstancesResponse response = instanceGroupManagerClient.listManagedInstancesInstanceGroupManagers(instanceGroupManager);
   }

  instance-group-manager - The name of the managed instance group. - `com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagersListManagedInstancesResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.InstanceGroupManagersListManagedInstancesResponse [^InstanceGroupManagerClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName instance-group-manager]
    (-> this (.listManagedInstancesInstanceGroupManagers instance-group-manager))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagerSettings`"
  (^com.google.cloud.compute.v1.InstanceGroupManagerSettings [^InstanceGroupManagerClient this]
    (-> this (.getSettings))))

(defn aggregated-list-instance-group-managers-paged-callable
  "Retrieves the list of managed instance groups and groups them by zone.

   Sample code:



   try (InstanceGroupManagerClient instanceGroupManagerClient = InstanceGroupManagerClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListInstanceGroupManagersHttpRequest request = AggregatedListInstanceGroupManagersHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<AggregatedListInstanceGroupManagersPagedResponse> future = instanceGroupManagerClient.aggregatedListInstanceGroupManagersPagedCallable().futureCall(request);
     // Do something
     for (InstanceGroupManagersScopedList element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.InstanceGroupManagerClient$AggregatedListInstanceGroupManagersPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupManagerClient this]
    (-> this (.aggregatedListInstanceGroupManagersPagedCallable))))

(defn list-managed-instances-instance-group-managers-callable
  "Lists all of the instances in the managed instance group. Each instance in the list has a
   currentAction, which indicates the action that the managed instance group is performing on the
   instance. For example, if the group is still creating an instance, the currentAction is
   CREATING. If a previous action failed, the list displays the errors for that failed action.

   Sample code:



   try (InstanceGroupManagerClient instanceGroupManagerClient = InstanceGroupManagerClient.create()) {
     String formattedInstanceGroupManager = ProjectZoneInstanceGroupManagerName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE_GROUP_MANAGER]\");
     ListManagedInstancesInstanceGroupManagersHttpRequest request = ListManagedInstancesInstanceGroupManagersHttpRequest.newBuilder()
       .setInstanceGroupManager(formattedInstanceGroupManager)
       .build();
     ApiFuture<InstanceGroupManagersListManagedInstancesResponse> future = instanceGroupManagerClient.listManagedInstancesInstanceGroupManagersCallable().futureCall(request);
     // Do something
     InstanceGroupManagersListManagedInstancesResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListManagedInstancesInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.InstanceGroupManagersListManagedInstancesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupManagerClient this]
    (-> this (.listManagedInstancesInstanceGroupManagersCallable))))

(defn get-instance-group-manager
  "Returns all of the details about the specified managed instance group. Gets a list of available
   managed instance groups by making a list() request.

   Sample code:



   try (InstanceGroupManagerClient instanceGroupManagerClient = InstanceGroupManagerClient.create()) {
     ProjectZoneInstanceGroupManagerName instanceGroupManager = ProjectZoneInstanceGroupManagerName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE_GROUP_MANAGER]\");
     InstanceGroupManager response = instanceGroupManagerClient.getInstanceGroupManager(instanceGroupManager);
   }

  instance-group-manager - The name of the managed instance group. - `com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName`

  returns: `com.google.cloud.compute.v1.InstanceGroupManager`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.InstanceGroupManager [^InstanceGroupManagerClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName instance-group-manager]
    (-> this (.getInstanceGroupManager instance-group-manager))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.InstanceGroupManagerStub`"
  ([^InstanceGroupManagerClient this]
    (-> this (.getStub))))

(defn set-instance-template-instance-group-manager-callable
  "Specifies the instance template to use when creating new instances in this group. The templates
   for existing instances in the group do not change unless you recreate them.

   Sample code:



   try (InstanceGroupManagerClient instanceGroupManagerClient = InstanceGroupManagerClient.create()) {
     String formattedInstanceGroupManager = ProjectZoneInstanceGroupManagerName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE_GROUP_MANAGER]\");
     InstanceGroupManagersSetInstanceTemplateRequest instanceGroupManagersSetInstanceTemplateRequestResource = InstanceGroupManagersSetInstanceTemplateRequest.newBuilder().build();
     SetInstanceTemplateInstanceGroupManagerHttpRequest request = SetInstanceTemplateInstanceGroupManagerHttpRequest.newBuilder()
       .setInstanceGroupManager(formattedInstanceGroupManager)
       .setInstanceGroupManagersSetInstanceTemplateRequestResource(instanceGroupManagersSetInstanceTemplateRequestResource)
       .build();
     ApiFuture<Operation> future = instanceGroupManagerClient.setInstanceTemplateInstanceGroupManagerCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetInstanceTemplateInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupManagerClient this]
    (-> this (.setInstanceTemplateInstanceGroupManagerCallable))))

(defn get-instance-group-manager-callable
  "Returns all of the details about the specified managed instance group. Gets a list of available
   managed instance groups by making a list() request.

   Sample code:



   try (InstanceGroupManagerClient instanceGroupManagerClient = InstanceGroupManagerClient.create()) {
     String formattedInstanceGroupManager = ProjectZoneInstanceGroupManagerName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE_GROUP_MANAGER]\");
     GetInstanceGroupManagerHttpRequest request = GetInstanceGroupManagerHttpRequest.newBuilder()
       .setInstanceGroupManager(formattedInstanceGroupManager)
       .build();
     ApiFuture<InstanceGroupManager> future = instanceGroupManagerClient.getInstanceGroupManagerCallable().futureCall(request);
     // Do something
     InstanceGroupManager response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.InstanceGroupManager>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupManagerClient this]
    (-> this (.getInstanceGroupManagerCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^InstanceGroupManagerClient this]
    (-> this (.isShutdown))))

(defn resize-instance-group-manager-callable
  "Resizes the managed instance group. If you increase the size, the group creates new instances
   using the current instance template. If you decrease the size, the group deletes instances. The
   resize operation is marked DONE when the resize actions are scheduled even if the group has not
   yet added or deleted any instances. You must separately verify the status of the creating or
   deleting actions with the listmanagedinstances method.

   When resizing down, the instance group arbitrarily chooses the order in which VMs are
   deleted. The group takes into account some VM attributes when making the selection including:

   + The status of the VM instance.  The health of the VM instance.  The instance template
   version the VM is based on.  For regional managed instance groups, the location of the VM
   instance.

   This list is subject to change.

   If the group is part of a backend service that has enabled connection draining, it can take
   up to 60 seconds after the connection draining duration has elapsed before the VM instance is
   removed or deleted.

   Sample code:



   try (InstanceGroupManagerClient instanceGroupManagerClient = InstanceGroupManagerClient.create()) {
     Integer size = 0;
     String formattedInstanceGroupManager = ProjectZoneInstanceGroupManagerName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE_GROUP_MANAGER]\");
     ResizeInstanceGroupManagerHttpRequest request = ResizeInstanceGroupManagerHttpRequest.newBuilder()
       .setSize(size)
       .setInstanceGroupManager(formattedInstanceGroupManager)
       .build();
     ApiFuture<Operation> future = instanceGroupManagerClient.resizeInstanceGroupManagerCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ResizeInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupManagerClient this]
    (-> this (.resizeInstanceGroupManagerCallable))))

(defn insert-instance-group-manager-callable
  "Creates a managed instance group using the information that you specify in the request. After
   the group is created, instances in the group are created using the specified instance template.
   This operation is marked as DONE when the group is created even if the instances in the group
   have not yet been created. You must separately verify the status of the individual instances
   with the listmanagedinstances method.

   A managed instance group can have up to 1000 VM instances per group. Please contact Cloud
   Support if you need an increase in this limit.

   Sample code:



   try (InstanceGroupManagerClient instanceGroupManagerClient = InstanceGroupManagerClient.create()) {
     String formattedZone = ProjectZoneName.format(\"[PROJECT]\", \"[ZONE]\");
     InstanceGroupManager instanceGroupManagerResource = InstanceGroupManager.newBuilder().build();
     InsertInstanceGroupManagerHttpRequest request = InsertInstanceGroupManagerHttpRequest.newBuilder()
       .setZone(formattedZone)
       .setInstanceGroupManagerResource(instanceGroupManagerResource)
       .build();
     ApiFuture<Operation> future = instanceGroupManagerClient.insertInstanceGroupManagerCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupManagerClient this]
    (-> this (.insertInstanceGroupManagerCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^InstanceGroupManagerClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn recreate-instances-instance-group-manager
  "Flags the specified instances in the managed instance group to be immediately recreated. The
   instances are deleted and recreated using the current instance template for the managed
   instance group. This operation is marked as DONE when the flag is set even if the instances
   have not yet been recreated. You must separately verify the status of the recreating action
   with the listmanagedinstances method.

   If the group is part of a backend service that has enabled connection draining, it can take
   up to 60 seconds after the connection draining duration has elapsed before the VM instance is
   removed or deleted.

   You can specify a maximum of 1000 instances with this method per request.

   Sample code:



   try (InstanceGroupManagerClient instanceGroupManagerClient = InstanceGroupManagerClient.create()) {
     ProjectZoneInstanceGroupManagerName instanceGroupManager = ProjectZoneInstanceGroupManagerName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE_GROUP_MANAGER]\");
     InstanceGroupManagersRecreateInstancesRequest instanceGroupManagersRecreateInstancesRequestResource = InstanceGroupManagersRecreateInstancesRequest.newBuilder().build();
     Operation response = instanceGroupManagerClient.recreateInstancesInstanceGroupManager(instanceGroupManager, instanceGroupManagersRecreateInstancesRequestResource);
   }

  instance-group-manager - The name of the managed instance group. - `com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName`
  instance-group-managers-recreate-instances-request-resource - `com.google.cloud.compute.v1.InstanceGroupManagersRecreateInstancesRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceGroupManagerClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName instance-group-manager ^com.google.cloud.compute.v1.InstanceGroupManagersRecreateInstancesRequest instance-group-managers-recreate-instances-request-resource]
    (-> this (.recreateInstancesInstanceGroupManager instance-group-manager instance-group-managers-recreate-instances-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^InstanceGroupManagerClient this ^com.google.cloud.compute.v1.RecreateInstancesInstanceGroupManagerHttpRequest request]
    (-> this (.recreateInstancesInstanceGroupManager request))))

(defn shutdown
  ""
  ([^InstanceGroupManagerClient this]
    (-> this (.shutdown))))

(defn list-instance-group-managers-paged-callable
  "Retrieves a list of managed instance groups that are contained within the specified project and
   zone.

   Sample code:



   try (InstanceGroupManagerClient instanceGroupManagerClient = InstanceGroupManagerClient.create()) {
     String formattedZone = ProjectZoneName.format(\"[PROJECT]\", \"[ZONE]\");
     ListInstanceGroupManagersHttpRequest request = ListInstanceGroupManagersHttpRequest.newBuilder()
       .setZone(formattedZone)
       .build();
     ApiFuture<ListInstanceGroupManagersPagedResponse> future = instanceGroupManagerClient.listInstanceGroupManagersPagedCallable().futureCall(request);
     // Do something
     for (InstanceGroupManager element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.InstanceGroupManagerClient$ListInstanceGroupManagersPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupManagerClient this]
    (-> this (.listInstanceGroupManagersPagedCallable))))

(defn patch-instance-group-manager
  "Updates a managed instance group using the information that you specify in the request. This
   operation is marked as DONE when the group is patched even if the instances in the group are
   still in the process of being patched. You must separately verify the status of the individual
   instances with the listManagedInstances method. This method supports PATCH semantics and uses
   the JSON merge patch format and processing rules.

   Sample code:



   try (InstanceGroupManagerClient instanceGroupManagerClient = InstanceGroupManagerClient.create()) {
     ProjectZoneInstanceGroupManagerName instanceGroupManager = ProjectZoneInstanceGroupManagerName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE_GROUP_MANAGER]\");
     InstanceGroupManager instanceGroupManagerResource = InstanceGroupManager.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     Operation response = instanceGroupManagerClient.patchInstanceGroupManager(instanceGroupManager, instanceGroupManagerResource, fieldMask);
   }

  instance-group-manager - The name of the instance group manager. - `com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName`
  instance-group-manager-resource - An Instance Group Manager resource. (== resource_for beta.instanceGroupManagers ==) (== resource_for v1.instanceGroupManagers ==) (== resource_for beta.regionInstanceGroupManagers ==) (== resource_for v1.regionInstanceGroupManagers ==) - `com.google.cloud.compute.v1.InstanceGroupManager`
  field-mask - The fields that should be serialized (even if they have empty values). If the containing message object has a non-null fieldmask, then all the fields in the field mask (and only those fields in the field mask) will be serialized. If the containing object does not have a fieldmask, then only non-empty fields will be serialized. - `java.util.List`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceGroupManagerClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName instance-group-manager ^com.google.cloud.compute.v1.InstanceGroupManager instance-group-manager-resource ^java.util.List field-mask]
    (-> this (.patchInstanceGroupManager instance-group-manager instance-group-manager-resource field-mask)))
  (^com.google.cloud.compute.v1.Operation [^InstanceGroupManagerClient this ^com.google.cloud.compute.v1.PatchInstanceGroupManagerHttpRequest request]
    (-> this (.patchInstanceGroupManager request))))

(defn aggregated-list-instance-group-managers-callable
  "Retrieves the list of managed instance groups and groups them by zone.

   Sample code:



   try (InstanceGroupManagerClient instanceGroupManagerClient = InstanceGroupManagerClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListInstanceGroupManagersHttpRequest request = AggregatedListInstanceGroupManagersHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       InstanceGroupManagerAggregatedList response = instanceGroupManagerClient.aggregatedListInstanceGroupManagersCallable().call(request);
       for (InstanceGroupManagersScopedList element : response.getItemsMap()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.InstanceGroupManagerAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupManagerClient this]
    (-> this (.aggregatedListInstanceGroupManagersCallable))))

(defn abandon-instances-instance-group-manager-callable
  "Flags the specified instances to be removed from the managed instance group. Abandoning an
   instance does not delete the instance, but it does remove the instance from any target pools
   that are applied by the managed instance group. This method reduces the targetSize of the
   managed instance group by the number of instances that you abandon. This operation is marked as
   DONE when the action is scheduled even if the instances have not yet been removed from the
   group. You must separately verify the status of the abandoning action with the
   listmanagedinstances method.

   If the group is part of a backend service that has enabled connection draining, it can take
   up to 60 seconds after the connection draining duration has elapsed before the VM instance is
   removed or deleted.

   You can specify a maximum of 1000 instances with this method per request.

   Sample code:



   try (InstanceGroupManagerClient instanceGroupManagerClient = InstanceGroupManagerClient.create()) {
     String formattedInstanceGroupManager = ProjectZoneInstanceGroupManagerName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE_GROUP_MANAGER]\");
     InstanceGroupManagersAbandonInstancesRequest instanceGroupManagersAbandonInstancesRequestResource = InstanceGroupManagersAbandonInstancesRequest.newBuilder().build();
     AbandonInstancesInstanceGroupManagerHttpRequest request = AbandonInstancesInstanceGroupManagerHttpRequest.newBuilder()
       .setInstanceGroupManager(formattedInstanceGroupManager)
       .setInstanceGroupManagersAbandonInstancesRequestResource(instanceGroupManagersAbandonInstancesRequestResource)
       .build();
     ApiFuture<Operation> future = instanceGroupManagerClient.abandonInstancesInstanceGroupManagerCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AbandonInstancesInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupManagerClient this]
    (-> this (.abandonInstancesInstanceGroupManagerCallable))))

(defn close
  ""
  ([^InstanceGroupManagerClient this]
    (-> this (.close))))

(defn set-target-pools-instance-group-manager-callable
  "Modifies the target pools to which all instances in this managed instance group are assigned.
   The target pools automatically apply to all of the instances in the managed instance group.
   This operation is marked DONE when you make the request even if the instances have not yet been
   added to their target pools. The change might take some time to apply to all of the instances
   in the group depending on the size of the group.

   Sample code:



   try (InstanceGroupManagerClient instanceGroupManagerClient = InstanceGroupManagerClient.create()) {
     String formattedInstanceGroupManager = ProjectZoneInstanceGroupManagerName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE_GROUP_MANAGER]\");
     InstanceGroupManagersSetTargetPoolsRequest instanceGroupManagersSetTargetPoolsRequestResource = InstanceGroupManagersSetTargetPoolsRequest.newBuilder().build();
     SetTargetPoolsInstanceGroupManagerHttpRequest request = SetTargetPoolsInstanceGroupManagerHttpRequest.newBuilder()
       .setInstanceGroupManager(formattedInstanceGroupManager)
       .setInstanceGroupManagersSetTargetPoolsRequestResource(instanceGroupManagersSetTargetPoolsRequestResource)
       .build();
     ApiFuture<Operation> future = instanceGroupManagerClient.setTargetPoolsInstanceGroupManagerCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetTargetPoolsInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupManagerClient this]
    (-> this (.setTargetPoolsInstanceGroupManagerCallable))))

(defn set-instance-template-instance-group-manager
  "Specifies the instance template to use when creating new instances in this group. The templates
   for existing instances in the group do not change unless you recreate them.

   Sample code:



   try (InstanceGroupManagerClient instanceGroupManagerClient = InstanceGroupManagerClient.create()) {
     ProjectZoneInstanceGroupManagerName instanceGroupManager = ProjectZoneInstanceGroupManagerName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE_GROUP_MANAGER]\");
     InstanceGroupManagersSetInstanceTemplateRequest instanceGroupManagersSetInstanceTemplateRequestResource = InstanceGroupManagersSetInstanceTemplateRequest.newBuilder().build();
     Operation response = instanceGroupManagerClient.setInstanceTemplateInstanceGroupManager(instanceGroupManager, instanceGroupManagersSetInstanceTemplateRequestResource);
   }

  instance-group-manager - The name of the managed instance group. - `com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName`
  instance-group-managers-set-instance-template-request-resource - `com.google.cloud.compute.v1.InstanceGroupManagersSetInstanceTemplateRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceGroupManagerClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName instance-group-manager ^com.google.cloud.compute.v1.InstanceGroupManagersSetInstanceTemplateRequest instance-group-managers-set-instance-template-request-resource]
    (-> this (.setInstanceTemplateInstanceGroupManager instance-group-manager instance-group-managers-set-instance-template-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^InstanceGroupManagerClient this ^com.google.cloud.compute.v1.SetInstanceTemplateInstanceGroupManagerHttpRequest request]
    (-> this (.setInstanceTemplateInstanceGroupManager request))))

(defn list-instance-group-managers-callable
  "Retrieves a list of managed instance groups that are contained within the specified project and
   zone.

   Sample code:



   try (InstanceGroupManagerClient instanceGroupManagerClient = InstanceGroupManagerClient.create()) {
     String formattedZone = ProjectZoneName.format(\"[PROJECT]\", \"[ZONE]\");
     ListInstanceGroupManagersHttpRequest request = ListInstanceGroupManagersHttpRequest.newBuilder()
       .setZone(formattedZone)
       .build();
     while (true) {
       InstanceGroupManagerList response = instanceGroupManagerClient.listInstanceGroupManagersCallable().call(request);
       for (InstanceGroupManager element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.InstanceGroupManagerList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupManagerClient this]
    (-> this (.listInstanceGroupManagersCallable))))

(defn delete-instance-group-manager
  "Deletes the specified managed instance group and all of the instances in that group. Note that
   the instance group must not belong to a backend service. Read Deleting an instance group for
   more information.

   Sample code:



   try (InstanceGroupManagerClient instanceGroupManagerClient = InstanceGroupManagerClient.create()) {
     ProjectZoneInstanceGroupManagerName instanceGroupManager = ProjectZoneInstanceGroupManagerName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE_GROUP_MANAGER]\");
     Operation response = instanceGroupManagerClient.deleteInstanceGroupManager(instanceGroupManager);
   }

  instance-group-manager - The name of the managed instance group to delete. - `com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceGroupManagerClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName instance-group-manager]
    (-> this (.deleteInstanceGroupManager instance-group-manager))))

(defn abandon-instances-instance-group-manager
  "Flags the specified instances to be removed from the managed instance group. Abandoning an
   instance does not delete the instance, but it does remove the instance from any target pools
   that are applied by the managed instance group. This method reduces the targetSize of the
   managed instance group by the number of instances that you abandon. This operation is marked as
   DONE when the action is scheduled even if the instances have not yet been removed from the
   group. You must separately verify the status of the abandoning action with the
   listmanagedinstances method.

   If the group is part of a backend service that has enabled connection draining, it can take
   up to 60 seconds after the connection draining duration has elapsed before the VM instance is
   removed or deleted.

   You can specify a maximum of 1000 instances with this method per request.

   Sample code:



   try (InstanceGroupManagerClient instanceGroupManagerClient = InstanceGroupManagerClient.create()) {
     ProjectZoneInstanceGroupManagerName instanceGroupManager = ProjectZoneInstanceGroupManagerName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE_GROUP_MANAGER]\");
     InstanceGroupManagersAbandonInstancesRequest instanceGroupManagersAbandonInstancesRequestResource = InstanceGroupManagersAbandonInstancesRequest.newBuilder().build();
     Operation response = instanceGroupManagerClient.abandonInstancesInstanceGroupManager(instanceGroupManager, instanceGroupManagersAbandonInstancesRequestResource);
   }

  instance-group-manager - The name of the managed instance group. - `com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName`
  instance-group-managers-abandon-instances-request-resource - `com.google.cloud.compute.v1.InstanceGroupManagersAbandonInstancesRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceGroupManagerClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName instance-group-manager ^com.google.cloud.compute.v1.InstanceGroupManagersAbandonInstancesRequest instance-group-managers-abandon-instances-request-resource]
    (-> this (.abandonInstancesInstanceGroupManager instance-group-manager instance-group-managers-abandon-instances-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^InstanceGroupManagerClient this ^com.google.cloud.compute.v1.AbandonInstancesInstanceGroupManagerHttpRequest request]
    (-> this (.abandonInstancesInstanceGroupManager request))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^InstanceGroupManagerClient this]
    (-> this (.isTerminated))))

(defn aggregated-list-instance-group-managers
  "Retrieves the list of managed instance groups and groups them by zone.

   Sample code:



   try (InstanceGroupManagerClient instanceGroupManagerClient = InstanceGroupManagerClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (InstanceGroupManagersScopedList element : instanceGroupManagerClient.aggregatedListInstanceGroupManagers(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagerClient$AggregatedListInstanceGroupManagersPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.InstanceGroupManagerClient$AggregatedListInstanceGroupManagersPagedResponse [^InstanceGroupManagerClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.aggregatedListInstanceGroupManagers project))))

(defn patch-instance-group-manager-callable
  "Updates a managed instance group using the information that you specify in the request. This
   operation is marked as DONE when the group is patched even if the instances in the group are
   still in the process of being patched. You must separately verify the status of the individual
   instances with the listManagedInstances method. This method supports PATCH semantics and uses
   the JSON merge patch format and processing rules.

   Sample code:



   try (InstanceGroupManagerClient instanceGroupManagerClient = InstanceGroupManagerClient.create()) {
     String formattedInstanceGroupManager = ProjectZoneInstanceGroupManagerName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE_GROUP_MANAGER]\");
     InstanceGroupManager instanceGroupManagerResource = InstanceGroupManager.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     PatchInstanceGroupManagerHttpRequest request = PatchInstanceGroupManagerHttpRequest.newBuilder()
       .setInstanceGroupManager(formattedInstanceGroupManager)
       .setInstanceGroupManagerResource(instanceGroupManagerResource)
       .addAllFieldMask(fieldMask)
       .build();
     ApiFuture<Operation> future = instanceGroupManagerClient.patchInstanceGroupManagerCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupManagerClient this]
    (-> this (.patchInstanceGroupManagerCallable))))

(defn recreate-instances-instance-group-manager-callable
  "Flags the specified instances in the managed instance group to be immediately recreated. The
   instances are deleted and recreated using the current instance template for the managed
   instance group. This operation is marked as DONE when the flag is set even if the instances
   have not yet been recreated. You must separately verify the status of the recreating action
   with the listmanagedinstances method.

   If the group is part of a backend service that has enabled connection draining, it can take
   up to 60 seconds after the connection draining duration has elapsed before the VM instance is
   removed or deleted.

   You can specify a maximum of 1000 instances with this method per request.

   Sample code:



   try (InstanceGroupManagerClient instanceGroupManagerClient = InstanceGroupManagerClient.create()) {
     String formattedInstanceGroupManager = ProjectZoneInstanceGroupManagerName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE_GROUP_MANAGER]\");
     InstanceGroupManagersRecreateInstancesRequest instanceGroupManagersRecreateInstancesRequestResource = InstanceGroupManagersRecreateInstancesRequest.newBuilder().build();
     RecreateInstancesInstanceGroupManagerHttpRequest request = RecreateInstancesInstanceGroupManagerHttpRequest.newBuilder()
       .setInstanceGroupManager(formattedInstanceGroupManager)
       .setInstanceGroupManagersRecreateInstancesRequestResource(instanceGroupManagersRecreateInstancesRequestResource)
       .build();
     ApiFuture<Operation> future = instanceGroupManagerClient.recreateInstancesInstanceGroupManagerCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.RecreateInstancesInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupManagerClient this]
    (-> this (.recreateInstancesInstanceGroupManagerCallable))))

(defn insert-instance-group-manager
  "Creates a managed instance group using the information that you specify in the request. After
   the group is created, instances in the group are created using the specified instance template.
   This operation is marked as DONE when the group is created even if the instances in the group
   have not yet been created. You must separately verify the status of the individual instances
   with the listmanagedinstances method.

   A managed instance group can have up to 1000 VM instances per group. Please contact Cloud
   Support if you need an increase in this limit.

   Sample code:



   try (InstanceGroupManagerClient instanceGroupManagerClient = InstanceGroupManagerClient.create()) {
     ProjectZoneName zone = ProjectZoneName.of(\"[PROJECT]\", \"[ZONE]\");
     InstanceGroupManager instanceGroupManagerResource = InstanceGroupManager.newBuilder().build();
     Operation response = instanceGroupManagerClient.insertInstanceGroupManager(zone, instanceGroupManagerResource);
   }

  zone - The name of the zone where you want to create the managed instance group. - `com.google.cloud.compute.v1.ProjectZoneName`
  instance-group-manager-resource - An Instance Group Manager resource. (== resource_for beta.instanceGroupManagers ==) (== resource_for v1.instanceGroupManagers ==) (== resource_for beta.regionInstanceGroupManagers ==) (== resource_for v1.regionInstanceGroupManagers ==) - `com.google.cloud.compute.v1.InstanceGroupManager`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceGroupManagerClient this ^com.google.cloud.compute.v1.ProjectZoneName zone ^com.google.cloud.compute.v1.InstanceGroupManager instance-group-manager-resource]
    (-> this (.insertInstanceGroupManager zone instance-group-manager-resource)))
  (^com.google.cloud.compute.v1.Operation [^InstanceGroupManagerClient this ^com.google.cloud.compute.v1.InsertInstanceGroupManagerHttpRequest request]
    (-> this (.insertInstanceGroupManager request))))

(defn delete-instances-instance-group-manager-callable
  "Flags the specified instances in the managed instance group for immediate deletion. The
   instances are also removed from any target pools of which they were a member. This method
   reduces the targetSize of the managed instance group by the number of instances that you
   delete. This operation is marked as DONE when the action is scheduled even if the instances are
   still being deleted. You must separately verify the status of the deleting action with the
   listmanagedinstances method.

   If the group is part of a backend service that has enabled connection draining, it can take
   up to 60 seconds after the connection draining duration has elapsed before the VM instance is
   removed or deleted.

   You can specify a maximum of 1000 instances with this method per request.

   Sample code:



   try (InstanceGroupManagerClient instanceGroupManagerClient = InstanceGroupManagerClient.create()) {
     String formattedInstanceGroupManager = ProjectZoneInstanceGroupManagerName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE_GROUP_MANAGER]\");
     InstanceGroupManagersDeleteInstancesRequest instanceGroupManagersDeleteInstancesRequestResource = InstanceGroupManagersDeleteInstancesRequest.newBuilder().build();
     DeleteInstancesInstanceGroupManagerHttpRequest request = DeleteInstancesInstanceGroupManagerHttpRequest.newBuilder()
       .setInstanceGroupManager(formattedInstanceGroupManager)
       .setInstanceGroupManagersDeleteInstancesRequestResource(instanceGroupManagersDeleteInstancesRequestResource)
       .build();
     ApiFuture<Operation> future = instanceGroupManagerClient.deleteInstancesInstanceGroupManagerCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteInstancesInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceGroupManagerClient this]
    (-> this (.deleteInstancesInstanceGroupManagerCallable))))

(defn shutdown-now
  ""
  ([^InstanceGroupManagerClient this]
    (-> this (.shutdownNow))))

