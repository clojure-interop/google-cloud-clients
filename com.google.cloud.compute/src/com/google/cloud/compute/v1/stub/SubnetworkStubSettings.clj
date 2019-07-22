(ns com.google.cloud.compute.v1.stub.SubnetworkStubSettings
  "Settings class to configure an instance of SubnetworkStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteSubnetwork to 30 seconds:



  SubnetworkStubSettings.Builder subnetworkSettingsBuilder =
      SubnetworkStubSettings.newBuilder();
  subnetworkSettingsBuilder.deleteSubnetworkSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  SubnetworkStubSettings subnetworkSettings = subnetworkSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub SubnetworkStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (SubnetworkStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (SubnetworkStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (SubnetworkStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (SubnetworkStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.SubnetworkStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.SubnetworkStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (SubnetworkStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.SubnetworkStubSettings$Builder []
    (SubnetworkStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (SubnetworkStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (SubnetworkStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (SubnetworkStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (SubnetworkStubSettings/getDefaultServiceScopes )))

(defn patch-subnetwork-settings
  "Returns the object with the settings used for calls to patchSubnetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.PatchSubnetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SubnetworkStubSettings this]
    (-> this (.patchSubnetworkSettings))))

(defn get-subnetwork-settings
  "Returns the object with the settings used for calls to getSubnetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetSubnetworkHttpRequest,com.google.cloud.compute.v1.Subnetwork>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SubnetworkStubSettings this]
    (-> this (.getSubnetworkSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.SubnetworkStub`

  throws: java.io.IOException"
  ([^SubnetworkStubSettings this]
    (-> this (.createStub))))

(defn delete-subnetwork-settings
  "Returns the object with the settings used for calls to deleteSubnetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteSubnetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SubnetworkStubSettings this]
    (-> this (.deleteSubnetworkSettings))))

(defn set-iam-policy-subnetwork-settings
  "Returns the object with the settings used for calls to setIamPolicySubnetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetIamPolicySubnetworkHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SubnetworkStubSettings this]
    (-> this (.setIamPolicySubnetworkSettings))))

(defn expand-ip-cidr-range-subnetwork-settings
  "Returns the object with the settings used for calls to expandIpCidrRangeSubnetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.ExpandIpCidrRangeSubnetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SubnetworkStubSettings this]
    (-> this (.expandIpCidrRangeSubnetworkSettings))))

(defn set-private-ip-google-access-subnetwork-settings
  "Returns the object with the settings used for calls to setPrivateIpGoogleAccessSubnetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.SetPrivateIpGoogleAccessSubnetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SubnetworkStubSettings this]
    (-> this (.setPrivateIpGoogleAccessSubnetworkSettings))))

(defn list-subnetworks-settings
  "Returns the object with the settings used for calls to listSubnetworks.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListSubnetworksHttpRequest,com.google.cloud.compute.v1.SubnetworkList,com.google.cloud.compute.v1.SubnetworkClient$ListSubnetworksPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^SubnetworkStubSettings this]
    (-> this (.listSubnetworksSettings))))

(defn insert-subnetwork-settings
  "Returns the object with the settings used for calls to insertSubnetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertSubnetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SubnetworkStubSettings this]
    (-> this (.insertSubnetworkSettings))))

(defn list-usable-subnetworks-settings
  "Returns the object with the settings used for calls to listUsableSubnetworks.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListUsableSubnetworksHttpRequest,com.google.cloud.compute.v1.UsableSubnetworksAggregatedList,com.google.cloud.compute.v1.SubnetworkClient$ListUsableSubnetworksPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^SubnetworkStubSettings this]
    (-> this (.listUsableSubnetworksSettings))))

(defn get-iam-policy-subnetwork-settings
  "Returns the object with the settings used for calls to getIamPolicySubnetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetIamPolicySubnetworkHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SubnetworkStubSettings this]
    (-> this (.getIamPolicySubnetworkSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.SubnetworkStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.SubnetworkStubSettings$Builder [^SubnetworkStubSettings this]
    (-> this (.toBuilder))))

(defn aggregated-list-subnetworks-settings
  "Returns the object with the settings used for calls to aggregatedListSubnetworks.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.AggregatedListSubnetworksHttpRequest,com.google.cloud.compute.v1.SubnetworkAggregatedList,com.google.cloud.compute.v1.SubnetworkClient$AggregatedListSubnetworksPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^SubnetworkStubSettings this]
    (-> this (.aggregatedListSubnetworksSettings))))

(defn test-iam-permissions-subnetwork-settings
  "Returns the object with the settings used for calls to testIamPermissionsSubnetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.TestIamPermissionsSubnetworkHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SubnetworkStubSettings this]
    (-> this (.testIamPermissionsSubnetworkSettings))))

