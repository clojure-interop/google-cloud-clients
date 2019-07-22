(ns com.google.cloud.compute.v1.stub.InstanceStubSettings
  "Settings class to configure an instance of InstanceStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of addAccessConfigInstance to 30 seconds:



  InstanceStubSettings.Builder instanceSettingsBuilder =
      InstanceStubSettings.newBuilder();
  instanceSettingsBuilder.addAccessConfigInstanceSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  InstanceStubSettings instanceSettings = instanceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub InstanceStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (InstanceStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (InstanceStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (InstanceStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (InstanceStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.InstanceStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.InstanceStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (InstanceStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.InstanceStubSettings$Builder []
    (InstanceStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (InstanceStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (InstanceStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (InstanceStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (InstanceStubSettings/getDefaultServiceScopes )))

(defn delete-instance-settings
  "Returns the object with the settings used for calls to deleteInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceStubSettings this]
    (-> this (.deleteInstanceSettings))))

(defn set-labels-instance-settings
  "Returns the object with the settings used for calls to setLabelsInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetLabelsInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceStubSettings this]
    (-> this (.setLabelsInstanceSettings))))

(defn list-referrers-instances-settings
  "Returns the object with the settings used for calls to listReferrersInstances.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListReferrersInstancesHttpRequest,com.google.cloud.compute.v1.InstanceListReferrers,com.google.cloud.compute.v1.InstanceClient$ListReferrersInstancesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^InstanceStubSettings this]
    (-> this (.listReferrersInstancesSettings))))

(defn detach-disk-instance-settings
  "Returns the object with the settings used for calls to detachDiskInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DetachDiskInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceStubSettings this]
    (-> this (.detachDiskInstanceSettings))))

(defn simulate-maintenance-event-instance-settings
  "Returns the object with the settings used for calls to simulateMaintenanceEventInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SimulateMaintenanceEventInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceStubSettings this]
    (-> this (.simulateMaintenanceEventInstanceSettings))))

(defn set-disk-auto-delete-instance-settings
  "Returns the object with the settings used for calls to setDiskAutoDeleteInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetDiskAutoDeleteInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceStubSettings this]
    (-> this (.setDiskAutoDeleteInstanceSettings))))

(defn get-instance-settings
  "Returns the object with the settings used for calls to getInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetInstanceHttpRequest,com.google.cloud.compute.v1.Instance>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceStubSettings this]
    (-> this (.getInstanceSettings))))

(defn update-access-config-instance-settings
  "Returns the object with the settings used for calls to updateAccessConfigInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.UpdateAccessConfigInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceStubSettings this]
    (-> this (.updateAccessConfigInstanceSettings))))

(defn insert-instance-settings
  "Returns the object with the settings used for calls to insertInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceStubSettings this]
    (-> this (.insertInstanceSettings))))

(defn aggregated-list-instances-settings
  "Returns the object with the settings used for calls to aggregatedListInstances.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.AggregatedListInstancesHttpRequest,com.google.cloud.compute.v1.InstanceAggregatedList,com.google.cloud.compute.v1.InstanceClient$AggregatedListInstancesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^InstanceStubSettings this]
    (-> this (.aggregatedListInstancesSettings))))

(defn list-instances-settings
  "Returns the object with the settings used for calls to listInstances.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListInstancesHttpRequest,com.google.cloud.compute.v1.InstanceList,com.google.cloud.compute.v1.InstanceClient$ListInstancesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^InstanceStubSettings this]
    (-> this (.listInstancesSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.InstanceStub`

  throws: java.io.IOException"
  ([^InstanceStubSettings this]
    (-> this (.createStub))))

(defn set-shielded-instance-integrity-policy-instance-settings
  "Returns the object with the settings used for calls to
   setShieldedInstanceIntegrityPolicyInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetShieldedInstanceIntegrityPolicyInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceStubSettings this]
    (-> this (.setShieldedInstanceIntegrityPolicyInstanceSettings))))

(defn set-metadata-instance-settings
  "Returns the object with the settings used for calls to setMetadataInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetMetadataInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceStubSettings this]
    (-> this (.setMetadataInstanceSettings))))

(defn update-network-interface-instance-settings
  "Returns the object with the settings used for calls to updateNetworkInterfaceInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.UpdateNetworkInterfaceInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceStubSettings this]
    (-> this (.updateNetworkInterfaceInstanceSettings))))

(defn set-deletion-protection-instance-settings
  "Returns the object with the settings used for calls to setDeletionProtectionInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetDeletionProtectionInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceStubSettings this]
    (-> this (.setDeletionProtectionInstanceSettings))))

(defn stop-instance-settings
  "Returns the object with the settings used for calls to stopInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.StopInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceStubSettings this]
    (-> this (.stopInstanceSettings))))

(defn start-with-encryption-key-instance-settings
  "Returns the object with the settings used for calls to startWithEncryptionKeyInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.StartWithEncryptionKeyInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceStubSettings this]
    (-> this (.startWithEncryptionKeyInstanceSettings))))

(defn reset-instance-settings
  "Returns the object with the settings used for calls to resetInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.ResetInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceStubSettings this]
    (-> this (.resetInstanceSettings))))

(defn set-min-cpu-platform-instance-settings
  "Returns the object with the settings used for calls to setMinCpuPlatformInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetMinCpuPlatformInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceStubSettings this]
    (-> this (.setMinCpuPlatformInstanceSettings))))

(defn test-iam-permissions-instance-settings
  "Returns the object with the settings used for calls to testIamPermissionsInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.TestIamPermissionsInstanceHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceStubSettings this]
    (-> this (.testIamPermissionsInstanceSettings))))

(defn attach-disk-instance-settings
  "Returns the object with the settings used for calls to attachDiskInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.AttachDiskInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceStubSettings this]
    (-> this (.attachDiskInstanceSettings))))

(defn set-tags-instance-settings
  "Returns the object with the settings used for calls to setTagsInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetTagsInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceStubSettings this]
    (-> this (.setTagsInstanceSettings))))

(defn add-access-config-instance-settings
  "Returns the object with the settings used for calls to addAccessConfigInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.AddAccessConfigInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceStubSettings this]
    (-> this (.addAccessConfigInstanceSettings))))

(defn set-scheduling-instance-settings
  "Returns the object with the settings used for calls to setSchedulingInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetSchedulingInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceStubSettings this]
    (-> this (.setSchedulingInstanceSettings))))

(defn set-service-account-instance-settings
  "Returns the object with the settings used for calls to setServiceAccountInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetServiceAccountInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceStubSettings this]
    (-> this (.setServiceAccountInstanceSettings))))

(defn set-iam-policy-instance-settings
  "Returns the object with the settings used for calls to setIamPolicyInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetIamPolicyInstanceHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceStubSettings this]
    (-> this (.setIamPolicyInstanceSettings))))

(defn get-shielded-instance-identity-instance-settings
  "Returns the object with the settings used for calls to getShieldedInstanceIdentityInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetShieldedInstanceIdentityInstanceHttpRequest,com.google.cloud.compute.v1.ShieldedInstanceIdentity>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceStubSettings this]
    (-> this (.getShieldedInstanceIdentityInstanceSettings))))

(defn set-machine-type-instance-settings
  "Returns the object with the settings used for calls to setMachineTypeInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetMachineTypeInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceStubSettings this]
    (-> this (.setMachineTypeInstanceSettings))))

(defn start-instance-settings
  "Returns the object with the settings used for calls to startInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.StartInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceStubSettings this]
    (-> this (.startInstanceSettings))))

(defn delete-access-config-instance-settings
  "Returns the object with the settings used for calls to deleteAccessConfigInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteAccessConfigInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceStubSettings this]
    (-> this (.deleteAccessConfigInstanceSettings))))

(defn update-shielded-instance-config-instance-settings
  "Returns the object with the settings used for calls to updateShieldedInstanceConfigInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.UpdateShieldedInstanceConfigInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceStubSettings this]
    (-> this (.updateShieldedInstanceConfigInstanceSettings))))

(defn get-iam-policy-instance-settings
  "Returns the object with the settings used for calls to getIamPolicyInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetIamPolicyInstanceHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceStubSettings this]
    (-> this (.getIamPolicyInstanceSettings))))

(defn set-machine-resources-instance-settings
  "Returns the object with the settings used for calls to setMachineResourcesInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetMachineResourcesInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceStubSettings this]
    (-> this (.setMachineResourcesInstanceSettings))))

(defn get-serial-port-output-instance-settings
  "Returns the object with the settings used for calls to getSerialPortOutputInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetSerialPortOutputInstanceHttpRequest,com.google.cloud.compute.v1.SerialPortOutput>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^InstanceStubSettings this]
    (-> this (.getSerialPortOutputInstanceSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.InstanceStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.InstanceStubSettings$Builder [^InstanceStubSettings this]
    (-> this (.toBuilder))))

