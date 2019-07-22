(ns com.google.cloud.compute.v1.InstanceClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (InstanceClient instanceClient = InstanceClient.create()) {
    ProjectZoneInstanceName instance = ProjectZoneInstanceName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
    String networkInterface = \"\";
    AccessConfig accessConfigResource = AccessConfig.newBuilder().build();
    Operation response = instanceClient.addAccessConfigInstance(instance, networkInterface, accessConfigResource);
  }

  Note: close() needs to be called on the instanceClient object to clean up resources such as
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

  This class can be customized by passing in a custom instance of InstanceSettings to create().
  For example:

  To customize credentials:



  InstanceSettings instanceSettings =
      InstanceSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  InstanceClient instanceClient =
      InstanceClient.create(instanceSettings);

  To customize the endpoint:



  InstanceSettings instanceSettings =
      InstanceSettings.newBuilder().setEndpoint(myEndpoint).build();
  InstanceClient instanceClient =
      InstanceClient.create(instanceSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceClient]))

(defn *create
  "Constructs an instance of InstanceClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.InstanceSettings`

  returns: `com.google.cloud.compute.v1.InstanceClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.InstanceClient [^com.google.cloud.compute.v1.InstanceSettings settings]
    (InstanceClient/create settings))
  (^com.google.cloud.compute.v1.InstanceClient []
    (InstanceClient/create )))

(defn set-iam-policy-instance
  "Sets the access control policy on the specified resource. Replaces any existing policy.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     ProjectZoneInstanceResourceName resource = ProjectZoneInstanceResourceName.of(\"[PROJECT]\", \"[ZONE]\", \"[RESOURCE]\");
     ZoneSetPolicyRequest zoneSetPolicyRequestResource = ZoneSetPolicyRequest.newBuilder().build();
     Policy response = instanceClient.setIamPolicyInstance(resource, zoneSetPolicyRequestResource);
   }

  resource - Name or id of the resource for this request. - `com.google.cloud.compute.v1.ProjectZoneInstanceResourceName`
  zone-set-policy-request-resource - `com.google.cloud.compute.v1.ZoneSetPolicyRequest`

  returns: `com.google.cloud.compute.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Policy [^InstanceClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceResourceName resource ^com.google.cloud.compute.v1.ZoneSetPolicyRequest zone-set-policy-request-resource]
    (-> this (.setIamPolicyInstance resource zone-set-policy-request-resource)))
  (^com.google.cloud.compute.v1.Policy [^InstanceClient this ^com.google.cloud.compute.v1.SetIamPolicyInstanceHttpRequest request]
    (-> this (.setIamPolicyInstance request))))

(defn set-metadata-instance
  "Sets metadata for the specified instance to the data included in the request.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     ProjectZoneInstanceName instance = ProjectZoneInstanceName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     Metadata metadataResource = Metadata.newBuilder().build();
     Operation response = instanceClient.setMetadataInstance(instance, metadataResource);
   }

  instance - Name of the instance scoping this request. - `com.google.cloud.compute.v1.ProjectZoneInstanceName`
  metadata-resource - A metadata key/value entry. - `com.google.cloud.compute.v1.Metadata`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceName instance ^com.google.cloud.compute.v1.Metadata metadata-resource]
    (-> this (.setMetadataInstance instance metadata-resource)))
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.SetMetadataInstanceHttpRequest request]
    (-> this (.setMetadataInstance request))))

(defn reset-instance-callable
  "Performs a reset on the instance. This is a hard reset the VM does not do a graceful shutdown.
   For more information, see Resetting an instance.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     String formattedInstance = ProjectZoneInstanceName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     ResetInstanceHttpRequest request = ResetInstanceHttpRequest.newBuilder()
       .setInstance(formattedInstance)
       .build();
     ApiFuture<Operation> future = instanceClient.resetInstanceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ResetInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceClient this]
    (-> this (.resetInstanceCallable))))

(defn get-shielded-instance-identity-instance-callable
  "Returns the Shielded Instance Identity of an instance

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     String formattedInstance = ProjectZoneInstanceName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     GetShieldedInstanceIdentityInstanceHttpRequest request = GetShieldedInstanceIdentityInstanceHttpRequest.newBuilder()
       .setInstance(formattedInstance)
       .build();
     ApiFuture<ShieldedInstanceIdentity> future = instanceClient.getShieldedInstanceIdentityInstanceCallable().futureCall(request);
     // Do something
     ShieldedInstanceIdentity response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetShieldedInstanceIdentityInstanceHttpRequest,com.google.cloud.compute.v1.ShieldedInstanceIdentity>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceClient this]
    (-> this (.getShieldedInstanceIdentityInstanceCallable))))

(defn set-iam-policy-instance-callable
  "Sets the access control policy on the specified resource. Replaces any existing policy.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     String formattedResource = ProjectZoneInstanceResourceName.format(\"[PROJECT]\", \"[ZONE]\", \"[RESOURCE]\");
     ZoneSetPolicyRequest zoneSetPolicyRequestResource = ZoneSetPolicyRequest.newBuilder().build();
     SetIamPolicyInstanceHttpRequest request = SetIamPolicyInstanceHttpRequest.newBuilder()
       .setResource(formattedResource)
       .setZoneSetPolicyRequestResource(zoneSetPolicyRequestResource)
       .build();
     ApiFuture<Policy> future = instanceClient.setIamPolicyInstanceCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetIamPolicyInstanceHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceClient this]
    (-> this (.setIamPolicyInstanceCallable))))

(defn add-access-config-instance
  "Adds an access config to an instance's network interface.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     ProjectZoneInstanceName instance = ProjectZoneInstanceName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     String networkInterface = \"\";
     AccessConfig accessConfigResource = AccessConfig.newBuilder().build();
     Operation response = instanceClient.addAccessConfigInstance(instance, networkInterface, accessConfigResource);
   }

  instance - The instance name for this request. - `com.google.cloud.compute.v1.ProjectZoneInstanceName`
  network-interface - The name of the network interface to add to this instance. - `java.lang.String`
  access-config-resource - An access configuration attached to an instance's network interface. Only one access config per instance is supported. - `com.google.cloud.compute.v1.AccessConfig`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceName instance ^java.lang.String network-interface ^com.google.cloud.compute.v1.AccessConfig access-config-resource]
    (-> this (.addAccessConfigInstance instance network-interface access-config-resource)))
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.AddAccessConfigInstanceHttpRequest request]
    (-> this (.addAccessConfigInstance request))))

(defn set-min-cpu-platform-instance-callable
  "Changes the minimum CPU platform that this instance should use. This method can only be called
   on a stopped instance. For more information, read Specifying a Minimum CPU Platform.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     String formattedInstance = ProjectZoneInstanceName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     InstancesSetMinCpuPlatformRequest instancesSetMinCpuPlatformRequestResource = InstancesSetMinCpuPlatformRequest.newBuilder().build();
     SetMinCpuPlatformInstanceHttpRequest request = SetMinCpuPlatformInstanceHttpRequest.newBuilder()
       .setInstance(formattedInstance)
       .setInstancesSetMinCpuPlatformRequestResource(instancesSetMinCpuPlatformRequestResource)
       .build();
     ApiFuture<Operation> future = instanceClient.setMinCpuPlatformInstanceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetMinCpuPlatformInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceClient this]
    (-> this (.setMinCpuPlatformInstanceCallable))))

(defn start-instance
  "Starts an instance that was stopped using the instances().stop method. For more information,
   see Restart an instance.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     ProjectZoneInstanceName instance = ProjectZoneInstanceName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     Operation response = instanceClient.startInstance(instance);
   }

  instance - Name of the instance resource to start. - `com.google.cloud.compute.v1.ProjectZoneInstanceName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceName instance]
    (-> this (.startInstance instance))))

(defn set-service-account-instance
  "Sets the service account on the instance. For more information, read Changing the service
   account and access scopes for an instance.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     ProjectZoneInstanceName instance = ProjectZoneInstanceName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     InstancesSetServiceAccountRequest instancesSetServiceAccountRequestResource = InstancesSetServiceAccountRequest.newBuilder().build();
     Operation response = instanceClient.setServiceAccountInstance(instance, instancesSetServiceAccountRequestResource);
   }

  instance - Name of the instance resource to start. - `com.google.cloud.compute.v1.ProjectZoneInstanceName`
  instances-set-service-account-request-resource - `com.google.cloud.compute.v1.InstancesSetServiceAccountRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceName instance ^com.google.cloud.compute.v1.InstancesSetServiceAccountRequest instances-set-service-account-request-resource]
    (-> this (.setServiceAccountInstance instance instances-set-service-account-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.SetServiceAccountInstanceHttpRequest request]
    (-> this (.setServiceAccountInstance request))))

(defn delete-access-config-instance
  "Deletes an access config from an instance's network interface.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     ProjectZoneInstanceName instance = ProjectZoneInstanceName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     String networkInterface = \"\";
     String accessConfig = \"\";
     Operation response = instanceClient.deleteAccessConfigInstance(instance, networkInterface, accessConfig);
   }

  instance - The instance name for this request. - `com.google.cloud.compute.v1.ProjectZoneInstanceName`
  network-interface - The name of the network interface. - `java.lang.String`
  access-config - The name of the access config to delete. - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceName instance ^java.lang.String network-interface ^java.lang.String access-config]
    (-> this (.deleteAccessConfigInstance instance network-interface access-config)))
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.DeleteAccessConfigInstanceHttpRequest request]
    (-> this (.deleteAccessConfigInstance request))))

(defn list-referrers-instances-paged-callable
  "Retrieves the list of referrers to instances contained within the specified zone. For more
   information, read Viewing Referrers to VM Instances.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     String formattedInstance = ProjectZoneInstanceName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     ListReferrersInstancesHttpRequest request = ListReferrersInstancesHttpRequest.newBuilder()
       .setInstance(formattedInstance)
       .build();
     ApiFuture<ListReferrersInstancesPagedResponse> future = instanceClient.listReferrersInstancesPagedCallable().futureCall(request);
     // Do something
     for (Reference element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListReferrersInstancesHttpRequest,com.google.cloud.compute.v1.InstanceClient$ListReferrersInstancesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceClient this]
    (-> this (.listReferrersInstancesPagedCallable))))

(defn get-shielded-instance-identity-instance
  "Returns the Shielded Instance Identity of an instance

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     ProjectZoneInstanceName instance = ProjectZoneInstanceName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     ShieldedInstanceIdentity response = instanceClient.getShieldedInstanceIdentityInstance(instance);
   }

  instance - Name or id of the instance scoping this request. - `com.google.cloud.compute.v1.ProjectZoneInstanceName`

  returns: `com.google.cloud.compute.v1.ShieldedInstanceIdentity`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.ShieldedInstanceIdentity [^InstanceClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceName instance]
    (-> this (.getShieldedInstanceIdentityInstance instance))))

(defn aggregated-list-instances-paged-callable
  "Retrieves aggregated list of all of the instances in your project across all regions and zones.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListInstancesHttpRequest request = AggregatedListInstancesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<AggregatedListInstancesPagedResponse> future = instanceClient.aggregatedListInstancesPagedCallable().futureCall(request);
     // Do something
     for (InstancesScopedList element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListInstancesHttpRequest,com.google.cloud.compute.v1.InstanceClient$AggregatedListInstancesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceClient this]
    (-> this (.aggregatedListInstancesPagedCallable))))

(defn start-instance-callable
  "Starts an instance that was stopped using the instances().stop method. For more information,
   see Restart an instance.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     String formattedInstance = ProjectZoneInstanceName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     StartInstanceHttpRequest request = StartInstanceHttpRequest.newBuilder()
       .setInstance(formattedInstance)
       .build();
     ApiFuture<Operation> future = instanceClient.startInstanceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.StartInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceClient this]
    (-> this (.startInstanceCallable))))

(defn update-shielded-instance-config-instance
  "Updates the Shielded Instance config for an instance. You can only use this method on a stopped
   instance. This method supports PATCH semantics and uses the JSON merge patch format and
   processing rules.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     ProjectZoneInstanceName instance = ProjectZoneInstanceName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     ShieldedInstanceConfig shieldedInstanceConfigResource = ShieldedInstanceConfig.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     Operation response = instanceClient.updateShieldedInstanceConfigInstance(instance, shieldedInstanceConfigResource, fieldMask);
   }

  instance - Name or id of the instance scoping this request. - `com.google.cloud.compute.v1.ProjectZoneInstanceName`
  shielded-instance-config-resource - A set of Shielded Instance options. - `com.google.cloud.compute.v1.ShieldedInstanceConfig`
  field-mask - The fields that should be serialized (even if they have empty values). If the containing message object has a non-null fieldmask, then all the fields in the field mask (and only those fields in the field mask) will be serialized. If the containing object does not have a fieldmask, then only non-empty fields will be serialized. - `java.util.List`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceName instance ^com.google.cloud.compute.v1.ShieldedInstanceConfig shielded-instance-config-resource ^java.util.List field-mask]
    (-> this (.updateShieldedInstanceConfigInstance instance shielded-instance-config-resource field-mask)))
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.UpdateShieldedInstanceConfigInstanceHttpRequest request]
    (-> this (.updateShieldedInstanceConfigInstance request))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.InstanceSettings`"
  (^com.google.cloud.compute.v1.InstanceSettings [^InstanceClient this]
    (-> this (.getSettings))))

(defn get-iam-policy-instance-callable
  "Gets the access control policy for a resource. May be empty if no such policy or resource
   exists.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     String formattedResource = ProjectZoneInstanceResourceName.format(\"[PROJECT]\", \"[ZONE]\", \"[RESOURCE]\");
     GetIamPolicyInstanceHttpRequest request = GetIamPolicyInstanceHttpRequest.newBuilder()
       .setResource(formattedResource)
       .build();
     ApiFuture<Policy> future = instanceClient.getIamPolicyInstanceCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetIamPolicyInstanceHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceClient this]
    (-> this (.getIamPolicyInstanceCallable))))

(defn insert-instance-callable
  "Creates an instance resource in the specified project using the data included in the request.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     String formattedZone = ProjectZoneName.format(\"[PROJECT]\", \"[ZONE]\");
     Instance instanceResource = Instance.newBuilder().build();
     InsertInstanceHttpRequest request = InsertInstanceHttpRequest.newBuilder()
       .setZone(formattedZone)
       .setInstanceResource(instanceResource)
       .build();
     ApiFuture<Operation> future = instanceClient.insertInstanceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceClient this]
    (-> this (.insertInstanceCallable))))

(defn set-labels-instance
  "Sets labels on an instance. To learn more about labels, read the Labeling Resources
   documentation.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     ProjectZoneInstanceName instance = ProjectZoneInstanceName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     InstancesSetLabelsRequest instancesSetLabelsRequestResource = InstancesSetLabelsRequest.newBuilder().build();
     Operation response = instanceClient.setLabelsInstance(instance, instancesSetLabelsRequestResource);
   }

  instance - Name of the instance scoping this request. - `com.google.cloud.compute.v1.ProjectZoneInstanceName`
  instances-set-labels-request-resource - `com.google.cloud.compute.v1.InstancesSetLabelsRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceName instance ^com.google.cloud.compute.v1.InstancesSetLabelsRequest instances-set-labels-request-resource]
    (-> this (.setLabelsInstance instance instances-set-labels-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.SetLabelsInstanceHttpRequest request]
    (-> this (.setLabelsInstance request))))

(defn list-instances-callable
  "Retrieves the list of instances contained within the specified zone.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     String formattedZone = ProjectZoneName.format(\"[PROJECT]\", \"[ZONE]\");
     ListInstancesHttpRequest request = ListInstancesHttpRequest.newBuilder()
       .setZone(formattedZone)
       .build();
     while (true) {
       InstanceList response = instanceClient.listInstancesCallable().call(request);
       for (Instance element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInstancesHttpRequest,com.google.cloud.compute.v1.InstanceList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceClient this]
    (-> this (.listInstancesCallable))))

(defn stop-instance
  "Stops a running instance, shutting it down cleanly, and allows you to restart the instance at a
   later time. Stopped instances do not incur VM usage charges while they are stopped. However,
   resources that the VM is using, such as persistent disks and static IP addresses, will continue
   to be charged until they are deleted. For more information, see Stopping an instance.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     ProjectZoneInstanceName instance = ProjectZoneInstanceName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     Operation response = instanceClient.stopInstance(instance);
   }

  instance - Name of the instance resource to stop. - `com.google.cloud.compute.v1.ProjectZoneInstanceName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceName instance]
    (-> this (.stopInstance instance))))

(defn set-disk-auto-delete-instance-callable
  "Sets the auto-delete flag for a disk attached to an instance.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     String formattedInstance = ProjectZoneInstanceName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     Boolean autoDelete = false;
     String deviceName = \"\";
     SetDiskAutoDeleteInstanceHttpRequest request = SetDiskAutoDeleteInstanceHttpRequest.newBuilder()
       .setInstance(formattedInstance)
       .setAutoDelete(autoDelete)
       .setDeviceName(deviceName)
       .build();
     ApiFuture<Operation> future = instanceClient.setDiskAutoDeleteInstanceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetDiskAutoDeleteInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceClient this]
    (-> this (.setDiskAutoDeleteInstanceCallable))))

(defn attach-disk-instance
  "Attaches an existing Disk resource to an instance. You must first create the disk before you
   can attach it. It is not possible to create and attach a disk at the same time. For more
   information, read Adding a persistent disk to your instance.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     ProjectZoneInstanceName instance = ProjectZoneInstanceName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     Boolean forceAttach = false;
     AttachedDisk attachedDiskResource = AttachedDisk.newBuilder().build();
     Operation response = instanceClient.attachDiskInstance(instance, forceAttach, attachedDiskResource);
   }

  instance - The instance name for this request. - `com.google.cloud.compute.v1.ProjectZoneInstanceName`
  force-attach - Whether to force attach the disk even if it's currently attached to another instance. - `java.lang.Boolean`
  attached-disk-resource - An instance-attached disk resource. - `com.google.cloud.compute.v1.AttachedDisk`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceName instance ^java.lang.Boolean force-attach ^com.google.cloud.compute.v1.AttachedDisk attached-disk-resource]
    (-> this (.attachDiskInstance instance force-attach attached-disk-resource)))
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.AttachDiskInstanceHttpRequest request]
    (-> this (.attachDiskInstance request))))

(defn get-serial-port-output-instance
  "Returns the last 1 MB of serial port output from the specified instance.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     ProjectZoneInstanceName instance = ProjectZoneInstanceName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     Integer port = 0;
     String start = \"\";
     SerialPortOutput response = instanceClient.getSerialPortOutputInstance(instance, port, start);
   }

  instance - Name of the instance scoping this request. - `com.google.cloud.compute.v1.ProjectZoneInstanceName`
  port - Specifies which COM or serial port to retrieve data from. - `java.lang.Integer`
  start - Returns output starting from a specific byte position. Use this to page through output when the output is too large to return in a single request. For the initial request, leave this field unspecified. For subsequent calls, this field should be set to the next value returned in the previous call. - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SerialPortOutput`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.SerialPortOutput [^InstanceClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceName instance ^java.lang.Integer port ^java.lang.String start]
    (-> this (.getSerialPortOutputInstance instance port start)))
  (^com.google.cloud.compute.v1.SerialPortOutput [^InstanceClient this ^com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest request]
    (-> this (.getSerialPortOutputInstance request))))

(defn update-shielded-instance-config-instance-callable
  "Updates the Shielded Instance config for an instance. You can only use this method on a stopped
   instance. This method supports PATCH semantics and uses the JSON merge patch format and
   processing rules.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     String formattedInstance = ProjectZoneInstanceName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     ShieldedInstanceConfig shieldedInstanceConfigResource = ShieldedInstanceConfig.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     UpdateShieldedInstanceConfigInstanceHttpRequest request = UpdateShieldedInstanceConfigInstanceHttpRequest.newBuilder()
       .setInstance(formattedInstance)
       .setShieldedInstanceConfigResource(shieldedInstanceConfigResource)
       .addAllFieldMask(fieldMask)
       .build();
     ApiFuture<Operation> future = instanceClient.updateShieldedInstanceConfigInstanceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateShieldedInstanceConfigInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceClient this]
    (-> this (.updateShieldedInstanceConfigInstanceCallable))))

(defn set-machine-resources-instance-callable
  "Changes the number and/or type of accelerator for a stopped instance to the values specified in
   the request.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     String formattedInstance = ProjectZoneInstanceName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     InstancesSetMachineResourcesRequest instancesSetMachineResourcesRequestResource = InstancesSetMachineResourcesRequest.newBuilder().build();
     SetMachineResourcesInstanceHttpRequest request = SetMachineResourcesInstanceHttpRequest.newBuilder()
       .setInstance(formattedInstance)
       .setInstancesSetMachineResourcesRequestResource(instancesSetMachineResourcesRequestResource)
       .build();
     ApiFuture<Operation> future = instanceClient.setMachineResourcesInstanceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetMachineResourcesInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceClient this]
    (-> this (.setMachineResourcesInstanceCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.InstanceStub`"
  ([^InstanceClient this]
    (-> this (.getStub))))

(defn set-deletion-protection-instance-callable
  "Sets deletion protection on the instance.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     String formattedResource = ProjectZoneInstanceResourceName.format(\"[PROJECT]\", \"[ZONE]\", \"[RESOURCE]\");
     Boolean deletionProtection = false;
     SetDeletionProtectionInstanceHttpRequest request = SetDeletionProtectionInstanceHttpRequest.newBuilder()
       .setResource(formattedResource)
       .setDeletionProtection(deletionProtection)
       .build();
     ApiFuture<Operation> future = instanceClient.setDeletionProtectionInstanceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetDeletionProtectionInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceClient this]
    (-> this (.setDeletionProtectionInstanceCallable))))

(defn list-instances
  "Retrieves the list of instances contained within the specified zone.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     ProjectZoneName zone = ProjectZoneName.of(\"[PROJECT]\", \"[ZONE]\");
     for (Instance element : instanceClient.listInstances(zone).iterateAll()) {
       // doThingsWith(element);
     }
   }

  zone - The name of the zone for this request. - `com.google.cloud.compute.v1.ProjectZoneName`

  returns: `com.google.cloud.compute.v1.InstanceClient$ListInstancesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.InstanceClient$ListInstancesPagedResponse [^InstanceClient this ^com.google.cloud.compute.v1.ProjectZoneName zone]
    (-> this (.listInstances zone))))

(defn list-instances-paged-callable
  "Retrieves the list of instances contained within the specified zone.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     String formattedZone = ProjectZoneName.format(\"[PROJECT]\", \"[ZONE]\");
     ListInstancesHttpRequest request = ListInstancesHttpRequest.newBuilder()
       .setZone(formattedZone)
       .build();
     ApiFuture<ListInstancesPagedResponse> future = instanceClient.listInstancesPagedCallable().futureCall(request);
     // Do something
     for (Instance element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListInstancesHttpRequest,com.google.cloud.compute.v1.InstanceClient$ListInstancesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceClient this]
    (-> this (.listInstancesPagedCallable))))

(defn set-shielded-instance-integrity-policy-instance
  "Sets the Shielded Instance integrity policy for an instance. You can only use this method on a
   running instance. This method supports PATCH semantics and uses the JSON merge patch format and
   processing rules.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     ProjectZoneInstanceName instance = ProjectZoneInstanceName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     ShieldedInstanceIntegrityPolicy shieldedInstanceIntegrityPolicyResource = ShieldedInstanceIntegrityPolicy.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     Operation response = instanceClient.setShieldedInstanceIntegrityPolicyInstance(instance, shieldedInstanceIntegrityPolicyResource, fieldMask);
   }

  instance - Name or id of the instance scoping this request. - `com.google.cloud.compute.v1.ProjectZoneInstanceName`
  shielded-instance-integrity-policy-resource - The policy describes the baseline against which Instance boot integrity is measured. - `com.google.cloud.compute.v1.ShieldedInstanceIntegrityPolicy`
  field-mask - The fields that should be serialized (even if they have empty values). If the containing message object has a non-null fieldmask, then all the fields in the field mask (and only those fields in the field mask) will be serialized. If the containing object does not have a fieldmask, then only non-empty fields will be serialized. - `java.util.List`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceName instance ^com.google.cloud.compute.v1.ShieldedInstanceIntegrityPolicy shielded-instance-integrity-policy-resource ^java.util.List field-mask]
    (-> this (.setShieldedInstanceIntegrityPolicyInstance instance shielded-instance-integrity-policy-resource field-mask)))
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.SetShieldedInstanceIntegrityPolicyInstanceHttpRequest request]
    (-> this (.setShieldedInstanceIntegrityPolicyInstance request))))

(defn simulate-maintenance-event-instance-callable
  "Simulates a maintenance event on the instance.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     String formattedInstance = ProjectZoneInstanceName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     SimulateMaintenanceEventInstanceHttpRequest request = SimulateMaintenanceEventInstanceHttpRequest.newBuilder()
       .setInstance(formattedInstance)
       .build();
     ApiFuture<Operation> future = instanceClient.simulateMaintenanceEventInstanceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SimulateMaintenanceEventInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceClient this]
    (-> this (.simulateMaintenanceEventInstanceCallable))))

(defn set-metadata-instance-callable
  "Sets metadata for the specified instance to the data included in the request.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     String formattedInstance = ProjectZoneInstanceName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     Metadata metadataResource = Metadata.newBuilder().build();
     SetMetadataInstanceHttpRequest request = SetMetadataInstanceHttpRequest.newBuilder()
       .setInstance(formattedInstance)
       .setMetadataResource(metadataResource)
       .build();
     ApiFuture<Operation> future = instanceClient.setMetadataInstanceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetMetadataInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceClient this]
    (-> this (.setMetadataInstanceCallable))))

(defn delete-access-config-instance-callable
  "Deletes an access config from an instance's network interface.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     String formattedInstance = ProjectZoneInstanceName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     String networkInterface = \"\";
     String accessConfig = \"\";
     DeleteAccessConfigInstanceHttpRequest request = DeleteAccessConfigInstanceHttpRequest.newBuilder()
       .setInstance(formattedInstance)
       .setNetworkInterface(networkInterface)
       .setAccessConfig(accessConfig)
       .build();
     ApiFuture<Operation> future = instanceClient.deleteAccessConfigInstanceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteAccessConfigInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceClient this]
    (-> this (.deleteAccessConfigInstanceCallable))))

(defn set-labels-instance-callable
  "Sets labels on an instance. To learn more about labels, read the Labeling Resources
   documentation.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     String formattedInstance = ProjectZoneInstanceName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     InstancesSetLabelsRequest instancesSetLabelsRequestResource = InstancesSetLabelsRequest.newBuilder().build();
     SetLabelsInstanceHttpRequest request = SetLabelsInstanceHttpRequest.newBuilder()
       .setInstance(formattedInstance)
       .setInstancesSetLabelsRequestResource(instancesSetLabelsRequestResource)
       .build();
     ApiFuture<Operation> future = instanceClient.setLabelsInstanceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetLabelsInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceClient this]
    (-> this (.setLabelsInstanceCallable))))

(defn get-iam-policy-instance
  "Gets the access control policy for a resource. May be empty if no such policy or resource
   exists.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     ProjectZoneInstanceResourceName resource = ProjectZoneInstanceResourceName.of(\"[PROJECT]\", \"[ZONE]\", \"[RESOURCE]\");
     Policy response = instanceClient.getIamPolicyInstance(resource);
   }

  resource - Name or id of the resource for this request. - `com.google.cloud.compute.v1.ProjectZoneInstanceResourceName`

  returns: `com.google.cloud.compute.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Policy [^InstanceClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceResourceName resource]
    (-> this (.getIamPolicyInstance resource))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^InstanceClient this]
    (-> this (.isShutdown))))

(defn reset-instance
  "Performs a reset on the instance. This is a hard reset the VM does not do a graceful shutdown.
   For more information, see Resetting an instance.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     ProjectZoneInstanceName instance = ProjectZoneInstanceName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     Operation response = instanceClient.resetInstance(instance);
   }

  instance - Name of the instance scoping this request. - `com.google.cloud.compute.v1.ProjectZoneInstanceName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceName instance]
    (-> this (.resetInstance instance))))

(defn update-network-interface-instance
  "Updates an instance's network interface. This method follows PATCH semantics.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     ProjectZoneInstanceName instance = ProjectZoneInstanceName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     String networkInterface = \"\";
     NetworkInterface networkInterfaceResource = NetworkInterface.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     Operation response = instanceClient.updateNetworkInterfaceInstance(instance, networkInterface, networkInterfaceResource, fieldMask);
   }

  instance - The instance name for this request. - `com.google.cloud.compute.v1.ProjectZoneInstanceName`
  network-interface - The name of the network interface to update. - `java.lang.String`
  network-interface-resource - A network interface resource attached to an instance. - `com.google.cloud.compute.v1.NetworkInterface`
  field-mask - The fields that should be serialized (even if they have empty values). If the containing message object has a non-null fieldmask, then all the fields in the field mask (and only those fields in the field mask) will be serialized. If the containing object does not have a fieldmask, then only non-empty fields will be serialized. - `java.util.List`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceName instance ^java.lang.String network-interface ^com.google.cloud.compute.v1.NetworkInterface network-interface-resource ^java.util.List field-mask]
    (-> this (.updateNetworkInterfaceInstance instance network-interface network-interface-resource field-mask)))
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest request]
    (-> this (.updateNetworkInterfaceInstance request))))

(defn set-tags-instance-callable
  "Sets network tags for the specified instance to the data included in the request.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     String formattedInstance = ProjectZoneInstanceName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     Tags tagsResource = Tags.newBuilder().build();
     SetTagsInstanceHttpRequest request = SetTagsInstanceHttpRequest.newBuilder()
       .setInstance(formattedInstance)
       .setTagsResource(tagsResource)
       .build();
     ApiFuture<Operation> future = instanceClient.setTagsInstanceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetTagsInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceClient this]
    (-> this (.setTagsInstanceCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^InstanceClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn delete-instance
  "Deletes the specified Instance resource. For more information, see Stopping or Deleting an
   Instance.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     ProjectZoneInstanceName instance = ProjectZoneInstanceName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     Operation response = instanceClient.deleteInstance(instance);
   }

  instance - Name of the instance resource to delete. - `com.google.cloud.compute.v1.ProjectZoneInstanceName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceName instance]
    (-> this (.deleteInstance instance))))

(defn shutdown
  ""
  ([^InstanceClient this]
    (-> this (.shutdown))))

(defn list-referrers-instances
  "Retrieves the list of referrers to instances contained within the specified zone. For more
   information, read Viewing Referrers to VM Instances.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     ProjectZoneInstanceName instance = ProjectZoneInstanceName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     for (Reference element : instanceClient.listReferrersInstances(instance).iterateAll()) {
       // doThingsWith(element);
     }
   }

  instance - Name of the target instance scoping this request, or '-' if the request should span over all instances in the container. - `com.google.cloud.compute.v1.ProjectZoneInstanceName`

  returns: `com.google.cloud.compute.v1.InstanceClient$ListReferrersInstancesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.InstanceClient$ListReferrersInstancesPagedResponse [^InstanceClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceName instance]
    (-> this (.listReferrersInstances instance))))

(defn insert-instance
  "Creates an instance resource in the specified project using the data included in the request.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     ProjectZoneName zone = ProjectZoneName.of(\"[PROJECT]\", \"[ZONE]\");
     Instance instanceResource = Instance.newBuilder().build();
     Operation response = instanceClient.insertInstance(zone, instanceResource);
   }

  zone - The name of the zone for this request. - `com.google.cloud.compute.v1.ProjectZoneName`
  instance-resource - An Instance resource. (== resource_for beta.instances ==) (== resource_for v1.instances ==) - `com.google.cloud.compute.v1.Instance`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.ProjectZoneName zone ^com.google.cloud.compute.v1.Instance instance-resource]
    (-> this (.insertInstance zone instance-resource)))
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.InsertInstanceHttpRequest request]
    (-> this (.insertInstance request))))

(defn start-with-encryption-key-instance-callable
  "Starts an instance that was stopped using the instances().stop method. For more information,
   see Restart an instance.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     String formattedInstance = ProjectZoneInstanceName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     InstancesStartWithEncryptionKeyRequest instancesStartWithEncryptionKeyRequestResource = InstancesStartWithEncryptionKeyRequest.newBuilder().build();
     StartWithEncryptionKeyInstanceHttpRequest request = StartWithEncryptionKeyInstanceHttpRequest.newBuilder()
       .setInstance(formattedInstance)
       .setInstancesStartWithEncryptionKeyRequestResource(instancesStartWithEncryptionKeyRequestResource)
       .build();
     ApiFuture<Operation> future = instanceClient.startWithEncryptionKeyInstanceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.StartWithEncryptionKeyInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceClient this]
    (-> this (.startWithEncryptionKeyInstanceCallable))))

(defn add-access-config-instance-callable
  "Adds an access config to an instance's network interface.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     String formattedInstance = ProjectZoneInstanceName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     String networkInterface = \"\";
     AccessConfig accessConfigResource = AccessConfig.newBuilder().build();
     AddAccessConfigInstanceHttpRequest request = AddAccessConfigInstanceHttpRequest.newBuilder()
       .setInstance(formattedInstance)
       .setNetworkInterface(networkInterface)
       .setAccessConfigResource(accessConfigResource)
       .build();
     ApiFuture<Operation> future = instanceClient.addAccessConfigInstanceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AddAccessConfigInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceClient this]
    (-> this (.addAccessConfigInstanceCallable))))

(defn get-instance
  "Returns the specified Instance resource. Gets a list of available instances by making a list()
   request.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     ProjectZoneInstanceName instance = ProjectZoneInstanceName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     Instance response = instanceClient.getInstance(instance);
   }

  instance - Name of the instance resource to return. - `com.google.cloud.compute.v1.ProjectZoneInstanceName`

  returns: `com.google.cloud.compute.v1.Instance`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Instance [^InstanceClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceName instance]
    (-> this (.getInstance instance))))

(defn aggregated-list-instances-callable
  "Retrieves aggregated list of all of the instances in your project across all regions and zones.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     AggregatedListInstancesHttpRequest request = AggregatedListInstancesHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       InstanceAggregatedList response = instanceClient.aggregatedListInstancesCallable().call(request);
       for (InstancesScopedList element : response.getItemsMap()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListInstancesHttpRequest,com.google.cloud.compute.v1.InstanceAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceClient this]
    (-> this (.aggregatedListInstancesCallable))))

(defn attach-disk-instance-callable
  "Attaches an existing Disk resource to an instance. You must first create the disk before you
   can attach it. It is not possible to create and attach a disk at the same time. For more
   information, read Adding a persistent disk to your instance.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     String formattedInstance = ProjectZoneInstanceName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     Boolean forceAttach = false;
     AttachedDisk attachedDiskResource = AttachedDisk.newBuilder().build();
     AttachDiskInstanceHttpRequest request = AttachDiskInstanceHttpRequest.newBuilder()
       .setInstance(formattedInstance)
       .setForceAttach(forceAttach)
       .setAttachedDiskResource(attachedDiskResource)
       .build();
     ApiFuture<Operation> future = instanceClient.attachDiskInstanceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AttachDiskInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceClient this]
    (-> this (.attachDiskInstanceCallable))))

(defn set-disk-auto-delete-instance
  "Sets the auto-delete flag for a disk attached to an instance.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     ProjectZoneInstanceName instance = ProjectZoneInstanceName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     Boolean autoDelete = false;
     String deviceName = \"\";
     Operation response = instanceClient.setDiskAutoDeleteInstance(instance, autoDelete, deviceName);
   }

  instance - The instance name for this request. - `com.google.cloud.compute.v1.ProjectZoneInstanceName`
  auto-delete - Whether to auto-delete the disk when the instance is deleted. - `java.lang.Boolean`
  device-name - The device name of the disk to modify. Make a get() request on the instance to view currently attached disks and device names. - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceName instance ^java.lang.Boolean auto-delete ^java.lang.String device-name]
    (-> this (.setDiskAutoDeleteInstance instance auto-delete device-name)))
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.SetDiskAutoDeleteInstanceHttpRequest request]
    (-> this (.setDiskAutoDeleteInstance request))))

(defn set-deletion-protection-instance
  "Sets deletion protection on the instance.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     ProjectZoneInstanceResourceName resource = ProjectZoneInstanceResourceName.of(\"[PROJECT]\", \"[ZONE]\", \"[RESOURCE]\");
     Boolean deletionProtection = false;
     Operation response = instanceClient.setDeletionProtectionInstance(resource, deletionProtection);
   }

  resource - Name or id of the resource for this request. - `com.google.cloud.compute.v1.ProjectZoneInstanceResourceName`
  deletion-protection - Whether the resource should be protected against deletion. - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceResourceName resource ^java.lang.Boolean deletion-protection]
    (-> this (.setDeletionProtectionInstance resource deletion-protection)))
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.SetDeletionProtectionInstanceHttpRequest request]
    (-> this (.setDeletionProtectionInstance request))))

(defn set-service-account-instance-callable
  "Sets the service account on the instance. For more information, read Changing the service
   account and access scopes for an instance.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     String formattedInstance = ProjectZoneInstanceName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     InstancesSetServiceAccountRequest instancesSetServiceAccountRequestResource = InstancesSetServiceAccountRequest.newBuilder().build();
     SetServiceAccountInstanceHttpRequest request = SetServiceAccountInstanceHttpRequest.newBuilder()
       .setInstance(formattedInstance)
       .setInstancesSetServiceAccountRequestResource(instancesSetServiceAccountRequestResource)
       .build();
     ApiFuture<Operation> future = instanceClient.setServiceAccountInstanceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetServiceAccountInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceClient this]
    (-> this (.setServiceAccountInstanceCallable))))

(defn set-machine-type-instance-callable
  "Changes the machine type for a stopped instance to the machine type specified in the request.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     String formattedInstance = ProjectZoneInstanceName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     InstancesSetMachineTypeRequest instancesSetMachineTypeRequestResource = InstancesSetMachineTypeRequest.newBuilder().build();
     SetMachineTypeInstanceHttpRequest request = SetMachineTypeInstanceHttpRequest.newBuilder()
       .setInstance(formattedInstance)
       .setInstancesSetMachineTypeRequestResource(instancesSetMachineTypeRequestResource)
       .build();
     ApiFuture<Operation> future = instanceClient.setMachineTypeInstanceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetMachineTypeInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceClient this]
    (-> this (.setMachineTypeInstanceCallable))))

(defn set-shielded-instance-integrity-policy-instance-callable
  "Sets the Shielded Instance integrity policy for an instance. You can only use this method on a
   running instance. This method supports PATCH semantics and uses the JSON merge patch format and
   processing rules.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     String formattedInstance = ProjectZoneInstanceName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     ShieldedInstanceIntegrityPolicy shieldedInstanceIntegrityPolicyResource = ShieldedInstanceIntegrityPolicy.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     SetShieldedInstanceIntegrityPolicyInstanceHttpRequest request = SetShieldedInstanceIntegrityPolicyInstanceHttpRequest.newBuilder()
       .setInstance(formattedInstance)
       .setShieldedInstanceIntegrityPolicyResource(shieldedInstanceIntegrityPolicyResource)
       .addAllFieldMask(fieldMask)
       .build();
     ApiFuture<Operation> future = instanceClient.setShieldedInstanceIntegrityPolicyInstanceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetShieldedInstanceIntegrityPolicyInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceClient this]
    (-> this (.setShieldedInstanceIntegrityPolicyInstanceCallable))))

(defn set-machine-type-instance
  "Changes the machine type for a stopped instance to the machine type specified in the request.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     ProjectZoneInstanceName instance = ProjectZoneInstanceName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     InstancesSetMachineTypeRequest instancesSetMachineTypeRequestResource = InstancesSetMachineTypeRequest.newBuilder().build();
     Operation response = instanceClient.setMachineTypeInstance(instance, instancesSetMachineTypeRequestResource);
   }

  instance - Name of the instance scoping this request. - `com.google.cloud.compute.v1.ProjectZoneInstanceName`
  instances-set-machine-type-request-resource - `com.google.cloud.compute.v1.InstancesSetMachineTypeRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceName instance ^com.google.cloud.compute.v1.InstancesSetMachineTypeRequest instances-set-machine-type-request-resource]
    (-> this (.setMachineTypeInstance instance instances-set-machine-type-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.SetMachineTypeInstanceHttpRequest request]
    (-> this (.setMachineTypeInstance request))))

(defn close
  ""
  ([^InstanceClient this]
    (-> this (.close))))

(defn set-scheduling-instance
  "Sets an instance's scheduling options.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     ProjectZoneInstanceName instance = ProjectZoneInstanceName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     Scheduling schedulingResource = Scheduling.newBuilder().build();
     Operation response = instanceClient.setSchedulingInstance(instance, schedulingResource);
   }

  instance - Instance name for this request. - `com.google.cloud.compute.v1.ProjectZoneInstanceName`
  scheduling-resource - Sets the scheduling options for an Instance. - `com.google.cloud.compute.v1.Scheduling`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceName instance ^com.google.cloud.compute.v1.Scheduling scheduling-resource]
    (-> this (.setSchedulingInstance instance scheduling-resource)))
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.SetSchedulingInstanceHttpRequest request]
    (-> this (.setSchedulingInstance request))))

(defn detach-disk-instance-callable
  "Detaches a disk from an instance.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     String formattedInstance = ProjectZoneInstanceName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     String deviceName = \"\";
     DetachDiskInstanceHttpRequest request = DetachDiskInstanceHttpRequest.newBuilder()
       .setInstance(formattedInstance)
       .setDeviceName(deviceName)
       .build();
     ApiFuture<Operation> future = instanceClient.detachDiskInstanceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DetachDiskInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceClient this]
    (-> this (.detachDiskInstanceCallable))))

(defn set-machine-resources-instance
  "Changes the number and/or type of accelerator for a stopped instance to the values specified in
   the request.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     ProjectZoneInstanceName instance = ProjectZoneInstanceName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     InstancesSetMachineResourcesRequest instancesSetMachineResourcesRequestResource = InstancesSetMachineResourcesRequest.newBuilder().build();
     Operation response = instanceClient.setMachineResourcesInstance(instance, instancesSetMachineResourcesRequestResource);
   }

  instance - Name of the instance scoping this request. - `com.google.cloud.compute.v1.ProjectZoneInstanceName`
  instances-set-machine-resources-request-resource - `com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceName instance ^com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest instances-set-machine-resources-request-resource]
    (-> this (.setMachineResourcesInstance instance instances-set-machine-resources-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.SetMachineResourcesInstanceHttpRequest request]
    (-> this (.setMachineResourcesInstance request))))

(defn update-access-config-instance
  "Updates the specified access config from an instance's network interface with the data included
   in the request. This method supports PATCH semantics and uses the JSON merge patch format and
   processing rules.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     ProjectZoneInstanceName instance = ProjectZoneInstanceName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     String networkInterface = \"\";
     AccessConfig accessConfigResource = AccessConfig.newBuilder().build();
     Operation response = instanceClient.updateAccessConfigInstance(instance, networkInterface, accessConfigResource);
   }

  instance - The instance name for this request. - `com.google.cloud.compute.v1.ProjectZoneInstanceName`
  network-interface - The name of the network interface where the access config is attached. - `java.lang.String`
  access-config-resource - An access configuration attached to an instance's network interface. Only one access config per instance is supported. - `com.google.cloud.compute.v1.AccessConfig`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceName instance ^java.lang.String network-interface ^com.google.cloud.compute.v1.AccessConfig access-config-resource]
    (-> this (.updateAccessConfigInstance instance network-interface access-config-resource)))
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.UpdateAccessConfigInstanceHttpRequest request]
    (-> this (.updateAccessConfigInstance request))))

(defn delete-instance-callable
  "Deletes the specified Instance resource. For more information, see Stopping or Deleting an
   Instance.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     String formattedInstance = ProjectZoneInstanceName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     DeleteInstanceHttpRequest request = DeleteInstanceHttpRequest.newBuilder()
       .setInstance(formattedInstance)
       .build();
     ApiFuture<Operation> future = instanceClient.deleteInstanceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceClient this]
    (-> this (.deleteInstanceCallable))))

(defn set-min-cpu-platform-instance
  "Changes the minimum CPU platform that this instance should use. This method can only be called
   on a stopped instance. For more information, read Specifying a Minimum CPU Platform.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     ProjectZoneInstanceName instance = ProjectZoneInstanceName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     InstancesSetMinCpuPlatformRequest instancesSetMinCpuPlatformRequestResource = InstancesSetMinCpuPlatformRequest.newBuilder().build();
     Operation response = instanceClient.setMinCpuPlatformInstance(instance, instancesSetMinCpuPlatformRequestResource);
   }

  instance - Name of the instance scoping this request. - `com.google.cloud.compute.v1.ProjectZoneInstanceName`
  instances-set-min-cpu-platform-request-resource - `com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceName instance ^com.google.cloud.compute.v1.InstancesSetMinCpuPlatformRequest instances-set-min-cpu-platform-request-resource]
    (-> this (.setMinCpuPlatformInstance instance instances-set-min-cpu-platform-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.SetMinCpuPlatformInstanceHttpRequest request]
    (-> this (.setMinCpuPlatformInstance request))))

(defn test-iam-permissions-instance
  "Returns permissions that a caller has on the specified resource.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     ProjectZoneInstanceResourceName resource = ProjectZoneInstanceResourceName.of(\"[PROJECT]\", \"[ZONE]\", \"[RESOURCE]\");
     TestPermissionsRequest testPermissionsRequestResource = TestPermissionsRequest.newBuilder().build();
     TestPermissionsResponse response = instanceClient.testIamPermissionsInstance(resource, testPermissionsRequestResource);
   }

  resource - Name or id of the resource for this request. - `com.google.cloud.compute.v1.ProjectZoneInstanceResourceName`
  test-permissions-request-resource - `com.google.cloud.compute.v1.TestPermissionsRequest`

  returns: `com.google.cloud.compute.v1.TestPermissionsResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.TestPermissionsResponse [^InstanceClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceResourceName resource ^com.google.cloud.compute.v1.TestPermissionsRequest test-permissions-request-resource]
    (-> this (.testIamPermissionsInstance resource test-permissions-request-resource)))
  (^com.google.cloud.compute.v1.TestPermissionsResponse [^InstanceClient this ^com.google.cloud.compute.v1.TestIamPermissionsInstanceHttpRequest request]
    (-> this (.testIamPermissionsInstance request))))

(defn start-with-encryption-key-instance
  "Starts an instance that was stopped using the instances().stop method. For more information,
   see Restart an instance.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     ProjectZoneInstanceName instance = ProjectZoneInstanceName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     InstancesStartWithEncryptionKeyRequest instancesStartWithEncryptionKeyRequestResource = InstancesStartWithEncryptionKeyRequest.newBuilder().build();
     Operation response = instanceClient.startWithEncryptionKeyInstance(instance, instancesStartWithEncryptionKeyRequestResource);
   }

  instance - Name of the instance resource to start. - `com.google.cloud.compute.v1.ProjectZoneInstanceName`
  instances-start-with-encryption-key-request-resource - `com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceName instance ^com.google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest instances-start-with-encryption-key-request-resource]
    (-> this (.startWithEncryptionKeyInstance instance instances-start-with-encryption-key-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.StartWithEncryptionKeyInstanceHttpRequest request]
    (-> this (.startWithEncryptionKeyInstance request))))

(defn update-access-config-instance-callable
  "Updates the specified access config from an instance's network interface with the data included
   in the request. This method supports PATCH semantics and uses the JSON merge patch format and
   processing rules.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     String formattedInstance = ProjectZoneInstanceName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     String networkInterface = \"\";
     AccessConfig accessConfigResource = AccessConfig.newBuilder().build();
     UpdateAccessConfigInstanceHttpRequest request = UpdateAccessConfigInstanceHttpRequest.newBuilder()
       .setInstance(formattedInstance)
       .setNetworkInterface(networkInterface)
       .setAccessConfigResource(accessConfigResource)
       .build();
     ApiFuture<Operation> future = instanceClient.updateAccessConfigInstanceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateAccessConfigInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceClient this]
    (-> this (.updateAccessConfigInstanceCallable))))

(defn list-referrers-instances-callable
  "Retrieves the list of referrers to instances contained within the specified zone. For more
   information, read Viewing Referrers to VM Instances.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     String formattedInstance = ProjectZoneInstanceName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     ListReferrersInstancesHttpRequest request = ListReferrersInstancesHttpRequest.newBuilder()
       .setInstance(formattedInstance)
       .build();
     while (true) {
       InstanceListReferrers response = instanceClient.listReferrersInstancesCallable().call(request);
       for (Reference element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListReferrersInstancesHttpRequest,com.google.cloud.compute.v1.InstanceListReferrers>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceClient this]
    (-> this (.listReferrersInstancesCallable))))

(defn set-scheduling-instance-callable
  "Sets an instance's scheduling options.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     String formattedInstance = ProjectZoneInstanceName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     Scheduling schedulingResource = Scheduling.newBuilder().build();
     SetSchedulingInstanceHttpRequest request = SetSchedulingInstanceHttpRequest.newBuilder()
       .setInstance(formattedInstance)
       .setSchedulingResource(schedulingResource)
       .build();
     ApiFuture<Operation> future = instanceClient.setSchedulingInstanceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetSchedulingInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceClient this]
    (-> this (.setSchedulingInstanceCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^InstanceClient this]
    (-> this (.isTerminated))))

(defn simulate-maintenance-event-instance
  "Simulates a maintenance event on the instance.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     ProjectZoneInstanceName instance = ProjectZoneInstanceName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     Operation response = instanceClient.simulateMaintenanceEventInstance(instance);
   }

  instance - Name of the instance scoping this request. - `com.google.cloud.compute.v1.ProjectZoneInstanceName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceName instance]
    (-> this (.simulateMaintenanceEventInstance instance))))

(defn aggregated-list-instances
  "Retrieves aggregated list of all of the instances in your project across all regions and zones.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (InstancesScopedList element : instanceClient.aggregatedListInstances(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.InstanceClient$AggregatedListInstancesPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.InstanceClient$AggregatedListInstancesPagedResponse [^InstanceClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.aggregatedListInstances project))))

(defn stop-instance-callable
  "Stops a running instance, shutting it down cleanly, and allows you to restart the instance at a
   later time. Stopped instances do not incur VM usage charges while they are stopped. However,
   resources that the VM is using, such as persistent disks and static IP addresses, will continue
   to be charged until they are deleted. For more information, see Stopping an instance.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     String formattedInstance = ProjectZoneInstanceName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     StopInstanceHttpRequest request = StopInstanceHttpRequest.newBuilder()
       .setInstance(formattedInstance)
       .build();
     ApiFuture<Operation> future = instanceClient.stopInstanceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.StopInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceClient this]
    (-> this (.stopInstanceCallable))))

(defn get-instance-callable
  "Returns the specified Instance resource. Gets a list of available instances by making a list()
   request.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     String formattedInstance = ProjectZoneInstanceName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     GetInstanceHttpRequest request = GetInstanceHttpRequest.newBuilder()
       .setInstance(formattedInstance)
       .build();
     ApiFuture<Instance> future = instanceClient.getInstanceCallable().futureCall(request);
     // Do something
     Instance response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetInstanceHttpRequest,com.google.cloud.compute.v1.Instance>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceClient this]
    (-> this (.getInstanceCallable))))

(defn get-serial-port-output-instance-callable
  "Returns the last 1 MB of serial port output from the specified instance.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     String formattedInstance = ProjectZoneInstanceName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     Integer port = 0;
     String start = \"\";
     GetSerialPortOutputInstanceHttpRequest request = GetSerialPortOutputInstanceHttpRequest.newBuilder()
       .setInstance(formattedInstance)
       .setPort(port)
       .setStart(start)
       .build();
     ApiFuture<SerialPortOutput> future = instanceClient.getSerialPortOutputInstanceCallable().futureCall(request);
     // Do something
     SerialPortOutput response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest,com.google.cloud.compute.v1.SerialPortOutput>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceClient this]
    (-> this (.getSerialPortOutputInstanceCallable))))

(defn set-tags-instance
  "Sets network tags for the specified instance to the data included in the request.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     ProjectZoneInstanceName instance = ProjectZoneInstanceName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     Tags tagsResource = Tags.newBuilder().build();
     Operation response = instanceClient.setTagsInstance(instance, tagsResource);
   }

  instance - Name of the instance scoping this request. - `com.google.cloud.compute.v1.ProjectZoneInstanceName`
  tags-resource - A set of instance tags. - `com.google.cloud.compute.v1.Tags`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceName instance ^com.google.cloud.compute.v1.Tags tags-resource]
    (-> this (.setTagsInstance instance tags-resource)))
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.SetTagsInstanceHttpRequest request]
    (-> this (.setTagsInstance request))))

(defn shutdown-now
  ""
  ([^InstanceClient this]
    (-> this (.shutdownNow))))

(defn detach-disk-instance
  "Detaches a disk from an instance.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     ProjectZoneInstanceName instance = ProjectZoneInstanceName.of(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     String deviceName = \"\";
     Operation response = instanceClient.detachDiskInstance(instance, deviceName);
   }

  instance - Instance name for this request. - `com.google.cloud.compute.v1.ProjectZoneInstanceName`
  device-name - The device name of the disk to detach. Make a get() request on the instance to view currently attached disks and device names. - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.ProjectZoneInstanceName instance ^java.lang.String device-name]
    (-> this (.detachDiskInstance instance device-name)))
  (^com.google.cloud.compute.v1.Operation [^InstanceClient this ^com.google.cloud.compute.v1.DetachDiskInstanceHttpRequest request]
    (-> this (.detachDiskInstance request))))

(defn test-iam-permissions-instance-callable
  "Returns permissions that a caller has on the specified resource.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     String formattedResource = ProjectZoneInstanceResourceName.format(\"[PROJECT]\", \"[ZONE]\", \"[RESOURCE]\");
     TestPermissionsRequest testPermissionsRequestResource = TestPermissionsRequest.newBuilder().build();
     TestIamPermissionsInstanceHttpRequest request = TestIamPermissionsInstanceHttpRequest.newBuilder()
       .setResource(formattedResource)
       .setTestPermissionsRequestResource(testPermissionsRequestResource)
       .build();
     ApiFuture<TestPermissionsResponse> future = instanceClient.testIamPermissionsInstanceCallable().futureCall(request);
     // Do something
     TestPermissionsResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.TestIamPermissionsInstanceHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceClient this]
    (-> this (.testIamPermissionsInstanceCallable))))

(defn update-network-interface-instance-callable
  "Updates an instance's network interface. This method follows PATCH semantics.

   Sample code:



   try (InstanceClient instanceClient = InstanceClient.create()) {
     String formattedInstance = ProjectZoneInstanceName.format(\"[PROJECT]\", \"[ZONE]\", \"[INSTANCE]\");
     String networkInterface = \"\";
     NetworkInterface networkInterfaceResource = NetworkInterface.newBuilder().build();
     List<String> fieldMask = new ArrayList<>();
     UpdateNetworkInterfaceInstanceHttpRequest request = UpdateNetworkInterfaceInstanceHttpRequest.newBuilder()
       .setInstance(formattedInstance)
       .setNetworkInterface(networkInterface)
       .setNetworkInterfaceResource(networkInterfaceResource)
       .addAllFieldMask(fieldMask)
       .build();
     ApiFuture<Operation> future = instanceClient.updateNetworkInterfaceInstanceCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^InstanceClient this]
    (-> this (.updateNetworkInterfaceInstanceCallable))))

