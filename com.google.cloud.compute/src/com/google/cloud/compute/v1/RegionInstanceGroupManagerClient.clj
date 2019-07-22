(ns com.google.cloud.compute.v1.RegionInstanceGroupManagerClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (RegionInstanceGroupManagerClient regionInstanceGroupManagerClient = RegionInstanceGroupManagerClient.create()) {
    ProjectRegionInstanceGroupManagerName instanceGroupManager = ProjectRegionInstanceGroupManagerName.of(\"[PROJECT]\", \"[REGION]\", \"[INSTANCE_GROUP_MANAGER]\");
    RegionInstanceGroupManagersAbandonInstancesRequest regionInstanceGroupManagersAbandonInstancesRequestResource = RegionInstanceGroupManagersAbandonInstancesRequest.newBuilder().build();
    Operation response = regionInstanceGroupManagerClient.abandonInstancesRegionInstanceGroupManager(instanceGroupManager, regionInstanceGroupManagersAbandonInstancesRequestResource);
  }

  Note: close() needs to be called on the regionInstanceGroupManagerClient object to clean up
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

  This class can be customized by passing in a custom instance of
  RegionInstanceGroupManagerSettings to create(). For example:

  To customize credentials:



  RegionInstanceGroupManagerSettings regionInstanceGroupManagerSettings =
      RegionInstanceGroupManagerSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  RegionInstanceGroupManagerClient regionInstanceGroupManagerClient =
      RegionInstanceGroupManagerClient.create(regionInstanceGroupManagerSettings);

  To customize the endpoint:



  RegionInstanceGroupManagerSettings regionInstanceGroupManagerSettings =
      RegionInstanceGroupManagerSettings.newBuilder().setEndpoint(myEndpoint).build();
  RegionInstanceGroupManagerClient regionInstanceGroupManagerClient =
      RegionInstanceGroupManagerClient.create(regionInstanceGroupManagerSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionInstanceGroupManagerClient]))

(defn *create
  "Constructs an instance of RegionInstanceGroupManagerClient, using the given settings. The
   channels are created based on the settings passed in, or defaults for any settings that are not
   set.

  settings - `com.google.cloud.compute.v1.RegionInstanceGroupManagerSettings`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagerClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagerClient [^com.google.cloud.compute.v1.RegionInstanceGroupManagerSettings settings]
    (RegionInstanceGroupManagerClient/create settings))
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagerClient []
    (RegionInstanceGroupManagerClient/create )))

(defn insert-region-instance-group-manager-callable
  "Creates a managed instance group using the information that you specify in the request. After
   the group is created, instances in the group are created using the specified instance template.
   This operation is marked as DONE when the group is created even if the instances in the group
   have not yet been created. You must separately verify the status of the individual instances
   with the listmanagedinstances method.

   A regional managed instance group can contain up to 2000 instances.

   Sample code:



   try (RegionInstanceGroupManagerClient regionInstanceGroupManagerClient = RegionInstanceGroupManagerClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     InstanceGroupManager instanceGroupManagerResource = InstanceGroupManager.newBuilder().build();
     InsertRegionInstanceGroupManagerHttpRequest request = InsertRegionInstanceGroupManagerHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .setInstanceGroupManagerResource(instanceGroupManagerResource)
       .build();
     ApiFuture<Operation> future = regionInstanceGroupManagerClient.insertRegionInstanceGroupManagerCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionInstanceGroupManagerClient this]
    (-> this (.insertRegionInstanceGroupManagerCallable))))

(defn list-region-instance-group-managers-paged-callable
  "Retrieves the list of managed instance groups that are contained within the specified region.

   Sample code:



   try (RegionInstanceGroupManagerClient regionInstanceGroupManagerClient = RegionInstanceGroupManagerClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     ListRegionInstanceGroupManagersHttpRequest request = ListRegionInstanceGroupManagersHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .build();
     ApiFuture<ListRegionInstanceGroupManagersPagedResponse> future = regionInstanceGroupManagerClient.listRegionInstanceGroupManagersPagedCallable().futureCall(request);
     // Do something
     for (InstanceGroupManager element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.RegionInstanceGroupManagerClient$ListRegionInstanceGroupManagersPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionInstanceGroupManagerClient this]
    (-> this (.listRegionInstanceGroupManagersPagedCallable))))

(defn recreate-instances-region-instance-group-manager
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



   try (RegionInstanceGroupManagerClient regionInstanceGroupManagerClient = RegionInstanceGroupManagerClient.create()) {
     ProjectRegionInstanceGroupManagerName instanceGroupManager = ProjectRegionInstanceGroupManagerName.of(\"[PROJECT]\", \"[REGION]\", \"[INSTANCE_GROUP_MANAGER]\");
     RegionInstanceGroupManagersRecreateRequest regionInstanceGroupManagersRecreateRequestResource = RegionInstanceGroupManagersRecreateRequest.newBuilder().build();
     Operation response = regionInstanceGroupManagerClient.recreateInstancesRegionInstanceGroupManager(instanceGroupManager, regionInstanceGroupManagersRecreateRequestResource);
   }

  instance-group-manager - Name of the managed instance group. - `com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName`
  region-instance-group-managers-recreate-request-resource - `com.google.cloud.compute.v1.RegionInstanceGroupManagersRecreateRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^RegionInstanceGroupManagerClient this ^com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName instance-group-manager ^com.google.cloud.compute.v1.RegionInstanceGroupManagersRecreateRequest region-instance-group-managers-recreate-request-resource]
    (-> this (.recreateInstancesRegionInstanceGroupManager instance-group-manager region-instance-group-managers-recreate-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^RegionInstanceGroupManagerClient this ^com.google.cloud.compute.v1.RecreateInstancesRegionInstanceGroupManagerHttpRequest request]
    (-> this (.recreateInstancesRegionInstanceGroupManager request))))

(defn patch-region-instance-group-manager-callable
  "Updates a managed instance group using the information that you specify in the request. This
   operation is marked as DONE when the group is patched even if the instances in the group are
   still in the process of being patched. You must separately verify the status of the individual
   instances with the listmanagedinstances method. This method supports PATCH semantics and uses
   the JSON merge patch format and processing rules.

   Sample code:



   try (RegionInstanceGroupManagerClient regionInstanceGroupManagerClient = RegionInstanceGroupManagerClient.create()) {
     String formattedInstanceGroupManager = ProjectRegionInstanceGroupManagerName.format(\"[PROJECT]\", \"[REGION]\", \"[INSTANCE_GROUP_MANAGER]\");
     InstanceGroupManager instanceGroupManagerResource = InstanceGroupManager.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     PatchRegionInstanceGroupManagerHttpRequest request = PatchRegionInstanceGroupManagerHttpRequest.newBuilder()
       .setInstanceGroupManager(formattedInstanceGroupManager)
       .setInstanceGroupManagerResource(instanceGroupManagerResource)
       .addAllFieldMask(fieldMask)
       .build();
     ApiFuture<Operation> future = regionInstanceGroupManagerClient.patchRegionInstanceGroupManagerCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionInstanceGroupManagerClient this]
    (-> this (.patchRegionInstanceGroupManagerCallable))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagerSettings`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagerSettings [^RegionInstanceGroupManagerClient this]
    (-> this (.getSettings))))

(defn resize-region-instance-group-manager-callable
  "Changes the intended size of the managed instance group. If you increase the size, the group
   creates new instances using the current instance template. If you decrease the size, the group
   deletes one or more instances.

   The resize operation is marked DONE if the resize request is successful. The underlying
   actions take additional time. You must separately verify the status of the creating or deleting
   actions with the listmanagedinstances method.

   If the group is part of a backend service that has enabled connection draining, it can take
   up to 60 seconds after the connection draining duration has elapsed before the VM instance is
   removed or deleted.

   Sample code:



   try (RegionInstanceGroupManagerClient regionInstanceGroupManagerClient = RegionInstanceGroupManagerClient.create()) {
     Integer size = 0;
     String formattedInstanceGroupManager = ProjectRegionInstanceGroupManagerName.format(\"[PROJECT]\", \"[REGION]\", \"[INSTANCE_GROUP_MANAGER]\");
     ResizeRegionInstanceGroupManagerHttpRequest request = ResizeRegionInstanceGroupManagerHttpRequest.newBuilder()
       .setSize(size)
       .setInstanceGroupManager(formattedInstanceGroupManager)
       .build();
     ApiFuture<Operation> future = regionInstanceGroupManagerClient.resizeRegionInstanceGroupManagerCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ResizeRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionInstanceGroupManagerClient this]
    (-> this (.resizeRegionInstanceGroupManagerCallable))))

(defn list-region-instance-group-managers
  "Retrieves the list of managed instance groups that are contained within the specified region.

   Sample code:



   try (RegionInstanceGroupManagerClient regionInstanceGroupManagerClient = RegionInstanceGroupManagerClient.create()) {
     ProjectRegionName region = ProjectRegionName.of(\"[PROJECT]\", \"[REGION]\");
     for (InstanceGroupManager element : regionInstanceGroupManagerClient.listRegionInstanceGroupManagers(region).iterateAll()) {
       // doThingsWith(element);
     }
   }

  region - Name of the region scoping this request. - `com.google.cloud.compute.v1.ProjectRegionName`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagerClient$ListRegionInstanceGroupManagersPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagerClient$ListRegionInstanceGroupManagersPagedResponse [^RegionInstanceGroupManagerClient this ^com.google.cloud.compute.v1.ProjectRegionName region]
    (-> this (.listRegionInstanceGroupManagers region))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.RegionInstanceGroupManagerStub`"
  ([^RegionInstanceGroupManagerClient this]
    (-> this (.getStub))))

(defn set-target-pools-region-instance-group-manager-callable
  "Modifies the target pools to which all new instances in this group are assigned. Existing
   instances in the group are not affected.

   Sample code:



   try (RegionInstanceGroupManagerClient regionInstanceGroupManagerClient = RegionInstanceGroupManagerClient.create()) {
     String formattedInstanceGroupManager = ProjectRegionInstanceGroupManagerName.format(\"[PROJECT]\", \"[REGION]\", \"[INSTANCE_GROUP_MANAGER]\");
     RegionInstanceGroupManagersSetTargetPoolsRequest regionInstanceGroupManagersSetTargetPoolsRequestResource = RegionInstanceGroupManagersSetTargetPoolsRequest.newBuilder().build();
     SetTargetPoolsRegionInstanceGroupManagerHttpRequest request = SetTargetPoolsRegionInstanceGroupManagerHttpRequest.newBuilder()
       .setInstanceGroupManager(formattedInstanceGroupManager)
       .setRegionInstanceGroupManagersSetTargetPoolsRequestResource(regionInstanceGroupManagersSetTargetPoolsRequestResource)
       .build();
     ApiFuture<Operation> future = regionInstanceGroupManagerClient.setTargetPoolsRegionInstanceGroupManagerCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetTargetPoolsRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionInstanceGroupManagerClient this]
    (-> this (.setTargetPoolsRegionInstanceGroupManagerCallable))))

(defn patch-region-instance-group-manager
  "Updates a managed instance group using the information that you specify in the request. This
   operation is marked as DONE when the group is patched even if the instances in the group are
   still in the process of being patched. You must separately verify the status of the individual
   instances with the listmanagedinstances method. This method supports PATCH semantics and uses
   the JSON merge patch format and processing rules.

   Sample code:



   try (RegionInstanceGroupManagerClient regionInstanceGroupManagerClient = RegionInstanceGroupManagerClient.create()) {
     ProjectRegionInstanceGroupManagerName instanceGroupManager = ProjectRegionInstanceGroupManagerName.of(\"[PROJECT]\", \"[REGION]\", \"[INSTANCE_GROUP_MANAGER]\");
     InstanceGroupManager instanceGroupManagerResource = InstanceGroupManager.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     Operation response = regionInstanceGroupManagerClient.patchRegionInstanceGroupManager(instanceGroupManager, instanceGroupManagerResource, fieldMask);
   }

  instance-group-manager - The name of the instance group manager. - `com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName`
  instance-group-manager-resource - An Instance Group Manager resource. (== resource_for beta.instanceGroupManagers ==) (== resource_for v1.instanceGroupManagers ==) (== resource_for beta.regionInstanceGroupManagers ==) (== resource_for v1.regionInstanceGroupManagers ==) - `com.google.cloud.compute.v1.InstanceGroupManager`
  field-mask - The fields that should be serialized (even if they have empty values). If the containing message object has a non-null fieldmask, then all the fields in the field mask (and only those fields in the field mask) will be serialized. If the containing object does not have a fieldmask, then only non-empty fields will be serialized. - `java.util.List`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^RegionInstanceGroupManagerClient this ^com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName instance-group-manager ^com.google.cloud.compute.v1.InstanceGroupManager instance-group-manager-resource ^java.util.List field-mask]
    (-> this (.patchRegionInstanceGroupManager instance-group-manager instance-group-manager-resource field-mask)))
  (^com.google.cloud.compute.v1.Operation [^RegionInstanceGroupManagerClient this ^com.google.cloud.compute.v1.PatchRegionInstanceGroupManagerHttpRequest request]
    (-> this (.patchRegionInstanceGroupManager request))))

(defn set-instance-template-region-instance-group-manager-callable
  "Sets the instance template to use when creating new instances or recreating instances in this
   group. Existing instances are not affected.

   Sample code:



   try (RegionInstanceGroupManagerClient regionInstanceGroupManagerClient = RegionInstanceGroupManagerClient.create()) {
     String formattedInstanceGroupManager = ProjectRegionInstanceGroupManagerName.format(\"[PROJECT]\", \"[REGION]\", \"[INSTANCE_GROUP_MANAGER]\");
     RegionInstanceGroupManagersSetTemplateRequest regionInstanceGroupManagersSetTemplateRequestResource = RegionInstanceGroupManagersSetTemplateRequest.newBuilder().build();
     SetInstanceTemplateRegionInstanceGroupManagerHttpRequest request = SetInstanceTemplateRegionInstanceGroupManagerHttpRequest.newBuilder()
       .setInstanceGroupManager(formattedInstanceGroupManager)
       .setRegionInstanceGroupManagersSetTemplateRequestResource(regionInstanceGroupManagersSetTemplateRequestResource)
       .build();
     ApiFuture<Operation> future = regionInstanceGroupManagerClient.setInstanceTemplateRegionInstanceGroupManagerCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetInstanceTemplateRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionInstanceGroupManagerClient this]
    (-> this (.setInstanceTemplateRegionInstanceGroupManagerCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^RegionInstanceGroupManagerClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^RegionInstanceGroupManagerClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn abandon-instances-region-instance-group-manager
  "Flags the specified instances to be immediately removed from the managed instance group.
   Abandoning an instance does not delete the instance, but it does remove the instance from any
   target pools that are applied by the managed instance group. This method reduces the targetSize
   of the managed instance group by the number of instances that you abandon. This operation is
   marked as DONE when the action is scheduled even if the instances have not yet been removed
   from the group. You must separately verify the status of the abandoning action with the
   listmanagedinstances method.

   If the group is part of a backend service that has enabled connection draining, it can take
   up to 60 seconds after the connection draining duration has elapsed before the VM instance is
   removed or deleted.

   You can specify a maximum of 1000 instances with this method per request.

   Sample code:



   try (RegionInstanceGroupManagerClient regionInstanceGroupManagerClient = RegionInstanceGroupManagerClient.create()) {
     ProjectRegionInstanceGroupManagerName instanceGroupManager = ProjectRegionInstanceGroupManagerName.of(\"[PROJECT]\", \"[REGION]\", \"[INSTANCE_GROUP_MANAGER]\");
     RegionInstanceGroupManagersAbandonInstancesRequest regionInstanceGroupManagersAbandonInstancesRequestResource = RegionInstanceGroupManagersAbandonInstancesRequest.newBuilder().build();
     Operation response = regionInstanceGroupManagerClient.abandonInstancesRegionInstanceGroupManager(instanceGroupManager, regionInstanceGroupManagersAbandonInstancesRequestResource);
   }

  instance-group-manager - Name of the managed instance group. - `com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName`
  region-instance-group-managers-abandon-instances-request-resource - `com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^RegionInstanceGroupManagerClient this ^com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName instance-group-manager ^com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest region-instance-group-managers-abandon-instances-request-resource]
    (-> this (.abandonInstancesRegionInstanceGroupManager instance-group-manager region-instance-group-managers-abandon-instances-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^RegionInstanceGroupManagerClient this ^com.google.cloud.compute.v1.AbandonInstancesRegionInstanceGroupManagerHttpRequest request]
    (-> this (.abandonInstancesRegionInstanceGroupManager request))))

(defn recreate-instances-region-instance-group-manager-callable
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



   try (RegionInstanceGroupManagerClient regionInstanceGroupManagerClient = RegionInstanceGroupManagerClient.create()) {
     String formattedInstanceGroupManager = ProjectRegionInstanceGroupManagerName.format(\"[PROJECT]\", \"[REGION]\", \"[INSTANCE_GROUP_MANAGER]\");
     RegionInstanceGroupManagersRecreateRequest regionInstanceGroupManagersRecreateRequestResource = RegionInstanceGroupManagersRecreateRequest.newBuilder().build();
     RecreateInstancesRegionInstanceGroupManagerHttpRequest request = RecreateInstancesRegionInstanceGroupManagerHttpRequest.newBuilder()
       .setInstanceGroupManager(formattedInstanceGroupManager)
       .setRegionInstanceGroupManagersRecreateRequestResource(regionInstanceGroupManagersRecreateRequestResource)
       .build();
     ApiFuture<Operation> future = regionInstanceGroupManagerClient.recreateInstancesRegionInstanceGroupManagerCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.RecreateInstancesRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionInstanceGroupManagerClient this]
    (-> this (.recreateInstancesRegionInstanceGroupManagerCallable))))

(defn delete-region-instance-group-manager
  "Deletes the specified managed instance group and all of the instances in that group.

   Sample code:



   try (RegionInstanceGroupManagerClient regionInstanceGroupManagerClient = RegionInstanceGroupManagerClient.create()) {
     ProjectRegionInstanceGroupManagerName instanceGroupManager = ProjectRegionInstanceGroupManagerName.of(\"[PROJECT]\", \"[REGION]\", \"[INSTANCE_GROUP_MANAGER]\");
     Operation response = regionInstanceGroupManagerClient.deleteRegionInstanceGroupManager(instanceGroupManager);
   }

  instance-group-manager - Name of the managed instance group to delete. - `com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^RegionInstanceGroupManagerClient this ^com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName instance-group-manager]
    (-> this (.deleteRegionInstanceGroupManager instance-group-manager))))

(defn shutdown
  ""
  ([^RegionInstanceGroupManagerClient this]
    (-> this (.shutdown))))

(defn list-managed-instances-region-instance-group-managers
  "Lists the instances in the managed instance group and instances that are scheduled to be
   created. The list includes any current actions that the group has scheduled for its instances.

   Sample code:



   try (RegionInstanceGroupManagerClient regionInstanceGroupManagerClient = RegionInstanceGroupManagerClient.create()) {
     ProjectRegionInstanceGroupManagerName instanceGroupManager = ProjectRegionInstanceGroupManagerName.of(\"[PROJECT]\", \"[REGION]\", \"[INSTANCE_GROUP_MANAGER]\");
     RegionInstanceGroupManagersListInstancesResponse response = regionInstanceGroupManagerClient.listManagedInstancesRegionInstanceGroupManagers(instanceGroupManager);
   }

  instance-group-manager - The name of the managed instance group. - `com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersListInstancesResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersListInstancesResponse [^RegionInstanceGroupManagerClient this ^com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName instance-group-manager]
    (-> this (.listManagedInstancesRegionInstanceGroupManagers instance-group-manager))))

(defn list-managed-instances-region-instance-group-managers-callable
  "Lists the instances in the managed instance group and instances that are scheduled to be
   created. The list includes any current actions that the group has scheduled for its instances.

   Sample code:



   try (RegionInstanceGroupManagerClient regionInstanceGroupManagerClient = RegionInstanceGroupManagerClient.create()) {
     String formattedInstanceGroupManager = ProjectRegionInstanceGroupManagerName.format(\"[PROJECT]\", \"[REGION]\", \"[INSTANCE_GROUP_MANAGER]\");
     ListManagedInstancesRegionInstanceGroupManagersHttpRequest request = ListManagedInstancesRegionInstanceGroupManagersHttpRequest.newBuilder()
       .setInstanceGroupManager(formattedInstanceGroupManager)
       .build();
     ApiFuture<RegionInstanceGroupManagersListInstancesResponse> future = regionInstanceGroupManagerClient.listManagedInstancesRegionInstanceGroupManagersCallable().futureCall(request);
     // Do something
     RegionInstanceGroupManagersListInstancesResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListManagedInstancesRegionInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.RegionInstanceGroupManagersListInstancesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionInstanceGroupManagerClient this]
    (-> this (.listManagedInstancesRegionInstanceGroupManagersCallable))))

(defn close
  ""
  ([^RegionInstanceGroupManagerClient this]
    (-> this (.close))))

(defn set-instance-template-region-instance-group-manager
  "Sets the instance template to use when creating new instances or recreating instances in this
   group. Existing instances are not affected.

   Sample code:



   try (RegionInstanceGroupManagerClient regionInstanceGroupManagerClient = RegionInstanceGroupManagerClient.create()) {
     ProjectRegionInstanceGroupManagerName instanceGroupManager = ProjectRegionInstanceGroupManagerName.of(\"[PROJECT]\", \"[REGION]\", \"[INSTANCE_GROUP_MANAGER]\");
     RegionInstanceGroupManagersSetTemplateRequest regionInstanceGroupManagersSetTemplateRequestResource = RegionInstanceGroupManagersSetTemplateRequest.newBuilder().build();
     Operation response = regionInstanceGroupManagerClient.setInstanceTemplateRegionInstanceGroupManager(instanceGroupManager, regionInstanceGroupManagersSetTemplateRequestResource);
   }

  instance-group-manager - The name of the managed instance group. - `com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName`
  region-instance-group-managers-set-template-request-resource - `com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTemplateRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^RegionInstanceGroupManagerClient this ^com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName instance-group-manager ^com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTemplateRequest region-instance-group-managers-set-template-request-resource]
    (-> this (.setInstanceTemplateRegionInstanceGroupManager instance-group-manager region-instance-group-managers-set-template-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^RegionInstanceGroupManagerClient this ^com.google.cloud.compute.v1.SetInstanceTemplateRegionInstanceGroupManagerHttpRequest request]
    (-> this (.setInstanceTemplateRegionInstanceGroupManager request))))

(defn get-region-instance-group-manager-callable
  "Returns all of the details about the specified managed instance group.

   Sample code:



   try (RegionInstanceGroupManagerClient regionInstanceGroupManagerClient = RegionInstanceGroupManagerClient.create()) {
     String formattedInstanceGroupManager = ProjectRegionInstanceGroupManagerName.format(\"[PROJECT]\", \"[REGION]\", \"[INSTANCE_GROUP_MANAGER]\");
     GetRegionInstanceGroupManagerHttpRequest request = GetRegionInstanceGroupManagerHttpRequest.newBuilder()
       .setInstanceGroupManager(formattedInstanceGroupManager)
       .build();
     ApiFuture<InstanceGroupManager> future = regionInstanceGroupManagerClient.getRegionInstanceGroupManagerCallable().futureCall(request);
     // Do something
     InstanceGroupManager response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.InstanceGroupManager>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionInstanceGroupManagerClient this]
    (-> this (.getRegionInstanceGroupManagerCallable))))

(defn get-region-instance-group-manager
  "Returns all of the details about the specified managed instance group.

   Sample code:



   try (RegionInstanceGroupManagerClient regionInstanceGroupManagerClient = RegionInstanceGroupManagerClient.create()) {
     ProjectRegionInstanceGroupManagerName instanceGroupManager = ProjectRegionInstanceGroupManagerName.of(\"[PROJECT]\", \"[REGION]\", \"[INSTANCE_GROUP_MANAGER]\");
     InstanceGroupManager response = regionInstanceGroupManagerClient.getRegionInstanceGroupManager(instanceGroupManager);
   }

  instance-group-manager - Name of the managed instance group to return. - `com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName`

  returns: `com.google.cloud.compute.v1.InstanceGroupManager`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.InstanceGroupManager [^RegionInstanceGroupManagerClient this ^com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName instance-group-manager]
    (-> this (.getRegionInstanceGroupManager instance-group-manager))))

(defn insert-region-instance-group-manager
  "Creates a managed instance group using the information that you specify in the request. After
   the group is created, instances in the group are created using the specified instance template.
   This operation is marked as DONE when the group is created even if the instances in the group
   have not yet been created. You must separately verify the status of the individual instances
   with the listmanagedinstances method.

   A regional managed instance group can contain up to 2000 instances.

   Sample code:



   try (RegionInstanceGroupManagerClient regionInstanceGroupManagerClient = RegionInstanceGroupManagerClient.create()) {
     ProjectRegionName region = ProjectRegionName.of(\"[PROJECT]\", \"[REGION]\");
     InstanceGroupManager instanceGroupManagerResource = InstanceGroupManager.newBuilder().build();
     Operation response = regionInstanceGroupManagerClient.insertRegionInstanceGroupManager(region, instanceGroupManagerResource);
   }

  region - Name of the region scoping this request. - `com.google.cloud.compute.v1.ProjectRegionName`
  instance-group-manager-resource - An Instance Group Manager resource. (== resource_for beta.instanceGroupManagers ==) (== resource_for v1.instanceGroupManagers ==) (== resource_for beta.regionInstanceGroupManagers ==) (== resource_for v1.regionInstanceGroupManagers ==) - `com.google.cloud.compute.v1.InstanceGroupManager`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^RegionInstanceGroupManagerClient this ^com.google.cloud.compute.v1.ProjectRegionName region ^com.google.cloud.compute.v1.InstanceGroupManager instance-group-manager-resource]
    (-> this (.insertRegionInstanceGroupManager region instance-group-manager-resource)))
  (^com.google.cloud.compute.v1.Operation [^RegionInstanceGroupManagerClient this ^com.google.cloud.compute.v1.InsertRegionInstanceGroupManagerHttpRequest request]
    (-> this (.insertRegionInstanceGroupManager request))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^RegionInstanceGroupManagerClient this]
    (-> this (.isTerminated))))

(defn delete-instances-region-instance-group-manager
  "Flags the specified instances in the managed instance group to be immediately deleted. The
   instances are also removed from any target pools of which they were a member. This method
   reduces the targetSize of the managed instance group by the number of instances that you
   delete. The deleteInstances operation is marked DONE if the deleteInstances request is
   successful. The underlying actions take additional time. You must separately verify the status
   of the deleting action with the listmanagedinstances method.

   If the group is part of a backend service that has enabled connection draining, it can take
   up to 60 seconds after the connection draining duration has elapsed before the VM instance is
   removed or deleted.

   You can specify a maximum of 1000 instances with this method per request.

   Sample code:



   try (RegionInstanceGroupManagerClient regionInstanceGroupManagerClient = RegionInstanceGroupManagerClient.create()) {
     ProjectRegionInstanceGroupManagerName instanceGroupManager = ProjectRegionInstanceGroupManagerName.of(\"[PROJECT]\", \"[REGION]\", \"[INSTANCE_GROUP_MANAGER]\");
     RegionInstanceGroupManagersDeleteInstancesRequest regionInstanceGroupManagersDeleteInstancesRequestResource = RegionInstanceGroupManagersDeleteInstancesRequest.newBuilder().build();
     Operation response = regionInstanceGroupManagerClient.deleteInstancesRegionInstanceGroupManager(instanceGroupManager, regionInstanceGroupManagersDeleteInstancesRequestResource);
   }

  instance-group-manager - Name of the managed instance group. - `com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName`
  region-instance-group-managers-delete-instances-request-resource - `com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^RegionInstanceGroupManagerClient this ^com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName instance-group-manager ^com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest region-instance-group-managers-delete-instances-request-resource]
    (-> this (.deleteInstancesRegionInstanceGroupManager instance-group-manager region-instance-group-managers-delete-instances-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^RegionInstanceGroupManagerClient this ^com.google.cloud.compute.v1.DeleteInstancesRegionInstanceGroupManagerHttpRequest request]
    (-> this (.deleteInstancesRegionInstanceGroupManager request))))

(defn set-target-pools-region-instance-group-manager
  "Modifies the target pools to which all new instances in this group are assigned. Existing
   instances in the group are not affected.

   Sample code:



   try (RegionInstanceGroupManagerClient regionInstanceGroupManagerClient = RegionInstanceGroupManagerClient.create()) {
     ProjectRegionInstanceGroupManagerName instanceGroupManager = ProjectRegionInstanceGroupManagerName.of(\"[PROJECT]\", \"[REGION]\", \"[INSTANCE_GROUP_MANAGER]\");
     RegionInstanceGroupManagersSetTargetPoolsRequest regionInstanceGroupManagersSetTargetPoolsRequestResource = RegionInstanceGroupManagersSetTargetPoolsRequest.newBuilder().build();
     Operation response = regionInstanceGroupManagerClient.setTargetPoolsRegionInstanceGroupManager(instanceGroupManager, regionInstanceGroupManagersSetTargetPoolsRequestResource);
   }

  instance-group-manager - Name of the managed instance group. - `com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName`
  region-instance-group-managers-set-target-pools-request-resource - `com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^RegionInstanceGroupManagerClient this ^com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName instance-group-manager ^com.google.cloud.compute.v1.RegionInstanceGroupManagersSetTargetPoolsRequest region-instance-group-managers-set-target-pools-request-resource]
    (-> this (.setTargetPoolsRegionInstanceGroupManager instance-group-manager region-instance-group-managers-set-target-pools-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^RegionInstanceGroupManagerClient this ^com.google.cloud.compute.v1.SetTargetPoolsRegionInstanceGroupManagerHttpRequest request]
    (-> this (.setTargetPoolsRegionInstanceGroupManager request))))

(defn abandon-instances-region-instance-group-manager-callable
  "Flags the specified instances to be immediately removed from the managed instance group.
   Abandoning an instance does not delete the instance, but it does remove the instance from any
   target pools that are applied by the managed instance group. This method reduces the targetSize
   of the managed instance group by the number of instances that you abandon. This operation is
   marked as DONE when the action is scheduled even if the instances have not yet been removed
   from the group. You must separately verify the status of the abandoning action with the
   listmanagedinstances method.

   If the group is part of a backend service that has enabled connection draining, it can take
   up to 60 seconds after the connection draining duration has elapsed before the VM instance is
   removed or deleted.

   You can specify a maximum of 1000 instances with this method per request.

   Sample code:



   try (RegionInstanceGroupManagerClient regionInstanceGroupManagerClient = RegionInstanceGroupManagerClient.create()) {
     String formattedInstanceGroupManager = ProjectRegionInstanceGroupManagerName.format(\"[PROJECT]\", \"[REGION]\", \"[INSTANCE_GROUP_MANAGER]\");
     RegionInstanceGroupManagersAbandonInstancesRequest regionInstanceGroupManagersAbandonInstancesRequestResource = RegionInstanceGroupManagersAbandonInstancesRequest.newBuilder().build();
     AbandonInstancesRegionInstanceGroupManagerHttpRequest request = AbandonInstancesRegionInstanceGroupManagerHttpRequest.newBuilder()
       .setInstanceGroupManager(formattedInstanceGroupManager)
       .setRegionInstanceGroupManagersAbandonInstancesRequestResource(regionInstanceGroupManagersAbandonInstancesRequestResource)
       .build();
     ApiFuture<Operation> future = regionInstanceGroupManagerClient.abandonInstancesRegionInstanceGroupManagerCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AbandonInstancesRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionInstanceGroupManagerClient this]
    (-> this (.abandonInstancesRegionInstanceGroupManagerCallable))))

(defn delete-instances-region-instance-group-manager-callable
  "Flags the specified instances in the managed instance group to be immediately deleted. The
   instances are also removed from any target pools of which they were a member. This method
   reduces the targetSize of the managed instance group by the number of instances that you
   delete. The deleteInstances operation is marked DONE if the deleteInstances request is
   successful. The underlying actions take additional time. You must separately verify the status
   of the deleting action with the listmanagedinstances method.

   If the group is part of a backend service that has enabled connection draining, it can take
   up to 60 seconds after the connection draining duration has elapsed before the VM instance is
   removed or deleted.

   You can specify a maximum of 1000 instances with this method per request.

   Sample code:



   try (RegionInstanceGroupManagerClient regionInstanceGroupManagerClient = RegionInstanceGroupManagerClient.create()) {
     String formattedInstanceGroupManager = ProjectRegionInstanceGroupManagerName.format(\"[PROJECT]\", \"[REGION]\", \"[INSTANCE_GROUP_MANAGER]\");
     RegionInstanceGroupManagersDeleteInstancesRequest regionInstanceGroupManagersDeleteInstancesRequestResource = RegionInstanceGroupManagersDeleteInstancesRequest.newBuilder().build();
     DeleteInstancesRegionInstanceGroupManagerHttpRequest request = DeleteInstancesRegionInstanceGroupManagerHttpRequest.newBuilder()
       .setInstanceGroupManager(formattedInstanceGroupManager)
       .setRegionInstanceGroupManagersDeleteInstancesRequestResource(regionInstanceGroupManagersDeleteInstancesRequestResource)
       .build();
     ApiFuture<Operation> future = regionInstanceGroupManagerClient.deleteInstancesRegionInstanceGroupManagerCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteInstancesRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionInstanceGroupManagerClient this]
    (-> this (.deleteInstancesRegionInstanceGroupManagerCallable))))

(defn delete-region-instance-group-manager-callable
  "Deletes the specified managed instance group and all of the instances in that group.

   Sample code:



   try (RegionInstanceGroupManagerClient regionInstanceGroupManagerClient = RegionInstanceGroupManagerClient.create()) {
     String formattedInstanceGroupManager = ProjectRegionInstanceGroupManagerName.format(\"[PROJECT]\", \"[REGION]\", \"[INSTANCE_GROUP_MANAGER]\");
     DeleteRegionInstanceGroupManagerHttpRequest request = DeleteRegionInstanceGroupManagerHttpRequest.newBuilder()
       .setInstanceGroupManager(formattedInstanceGroupManager)
       .build();
     ApiFuture<Operation> future = regionInstanceGroupManagerClient.deleteRegionInstanceGroupManagerCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteRegionInstanceGroupManagerHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionInstanceGroupManagerClient this]
    (-> this (.deleteRegionInstanceGroupManagerCallable))))

(defn shutdown-now
  ""
  ([^RegionInstanceGroupManagerClient this]
    (-> this (.shutdownNow))))

(defn list-region-instance-group-managers-callable
  "Retrieves the list of managed instance groups that are contained within the specified region.

   Sample code:



   try (RegionInstanceGroupManagerClient regionInstanceGroupManagerClient = RegionInstanceGroupManagerClient.create()) {
     String formattedRegion = ProjectRegionName.format(\"[PROJECT]\", \"[REGION]\");
     ListRegionInstanceGroupManagersHttpRequest request = ListRegionInstanceGroupManagersHttpRequest.newBuilder()
       .setRegion(formattedRegion)
       .build();
     while (true) {
       RegionInstanceGroupManagerList response = regionInstanceGroupManagerClient.listRegionInstanceGroupManagersCallable().call(request);
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListRegionInstanceGroupManagersHttpRequest,com.google.cloud.compute.v1.RegionInstanceGroupManagerList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^RegionInstanceGroupManagerClient this]
    (-> this (.listRegionInstanceGroupManagersCallable))))

(defn resize-region-instance-group-manager
  "Changes the intended size of the managed instance group. If you increase the size, the group
   creates new instances using the current instance template. If you decrease the size, the group
   deletes one or more instances.

   The resize operation is marked DONE if the resize request is successful. The underlying
   actions take additional time. You must separately verify the status of the creating or deleting
   actions with the listmanagedinstances method.

   If the group is part of a backend service that has enabled connection draining, it can take
   up to 60 seconds after the connection draining duration has elapsed before the VM instance is
   removed or deleted.

   Sample code:



   try (RegionInstanceGroupManagerClient regionInstanceGroupManagerClient = RegionInstanceGroupManagerClient.create()) {
     Integer size = 0;
     ProjectRegionInstanceGroupManagerName instanceGroupManager = ProjectRegionInstanceGroupManagerName.of(\"[PROJECT]\", \"[REGION]\", \"[INSTANCE_GROUP_MANAGER]\");
     Operation response = regionInstanceGroupManagerClient.resizeRegionInstanceGroupManager(size, instanceGroupManager);
   }

  size - Number of instances that should exist in this instance group manager. - `java.lang.Integer`
  instance-group-manager - Name of the managed instance group. - `com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^RegionInstanceGroupManagerClient this ^java.lang.Integer size ^com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName instance-group-manager]
    (-> this (.resizeRegionInstanceGroupManager size instance-group-manager)))
  (^com.google.cloud.compute.v1.Operation [^RegionInstanceGroupManagerClient this ^com.google.cloud.compute.v1.ResizeRegionInstanceGroupManagerHttpRequest request]
    (-> this (.resizeRegionInstanceGroupManager request))))

