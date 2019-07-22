(ns com.google.cloud.compute.v1.SubnetworkSettings$Builder
  "Builder for SubnetworkSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SubnetworkSettings$Builder]))

(defn patch-subnetwork-settings
  "Returns the builder for the settings used for calls to patchSubnetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.PatchSubnetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SubnetworkSettings$Builder this]
    (-> this (.patchSubnetworkSettings))))

(defn get-subnetwork-settings
  "Returns the builder for the settings used for calls to getSubnetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetSubnetworkHttpRequest,com.google.cloud.compute.v1.Subnetwork>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SubnetworkSettings$Builder this]
    (-> this (.getSubnetworkSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.compute.v1.SubnetworkSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.compute.v1.SubnetworkSettings$Builder [^SubnetworkSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn delete-subnetwork-settings
  "Returns the builder for the settings used for calls to deleteSubnetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.DeleteSubnetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SubnetworkSettings$Builder this]
    (-> this (.deleteSubnetworkSettings))))

(defn set-iam-policy-subnetwork-settings
  "Returns the builder for the settings used for calls to setIamPolicySubnetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetIamPolicySubnetworkHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SubnetworkSettings$Builder this]
    (-> this (.setIamPolicySubnetworkSettings))))

(defn build
  "returns: `com.google.cloud.compute.v1.SubnetworkSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.SubnetworkSettings [^SubnetworkSettings$Builder this]
    (-> this (.build))))

(defn expand-ip-cidr-range-subnetwork-settings
  "Returns the builder for the settings used for calls to expandIpCidrRangeSubnetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.ExpandIpCidrRangeSubnetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SubnetworkSettings$Builder this]
    (-> this (.expandIpCidrRangeSubnetworkSettings))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.compute.v1.stub.SubnetworkStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.SubnetworkStubSettings$Builder [^SubnetworkSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn set-private-ip-google-access-subnetwork-settings
  "Returns the builder for the settings used for calls to setPrivateIpGoogleAccessSubnetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.SetPrivateIpGoogleAccessSubnetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SubnetworkSettings$Builder this]
    (-> this (.setPrivateIpGoogleAccessSubnetworkSettings))))

(defn list-subnetworks-settings
  "Returns the builder for the settings used for calls to listSubnetworks.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListSubnetworksHttpRequest,com.google.cloud.compute.v1.SubnetworkList,com.google.cloud.compute.v1.SubnetworkClient$ListSubnetworksPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^SubnetworkSettings$Builder this]
    (-> this (.listSubnetworksSettings))))

(defn insert-subnetwork-settings
  "Returns the builder for the settings used for calls to insertSubnetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.InsertSubnetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SubnetworkSettings$Builder this]
    (-> this (.insertSubnetworkSettings))))

(defn list-usable-subnetworks-settings
  "Returns the builder for the settings used for calls to listUsableSubnetworks.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.ListUsableSubnetworksHttpRequest,com.google.cloud.compute.v1.UsableSubnetworksAggregatedList,com.google.cloud.compute.v1.SubnetworkClient$ListUsableSubnetworksPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^SubnetworkSettings$Builder this]
    (-> this (.listUsableSubnetworksSettings))))

(defn get-iam-policy-subnetwork-settings
  "Returns the builder for the settings used for calls to getIamPolicySubnetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.GetIamPolicySubnetworkHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SubnetworkSettings$Builder this]
    (-> this (.getIamPolicySubnetworkSettings))))

(defn aggregated-list-subnetworks-settings
  "Returns the builder for the settings used for calls to aggregatedListSubnetworks.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.cloud.compute.v1.AggregatedListSubnetworksHttpRequest,com.google.cloud.compute.v1.SubnetworkAggregatedList,com.google.cloud.compute.v1.SubnetworkClient$AggregatedListSubnetworksPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^SubnetworkSettings$Builder this]
    (-> this (.aggregatedListSubnetworksSettings))))

(defn test-iam-permissions-subnetwork-settings
  "Returns the builder for the settings used for calls to testIamPermissionsSubnetwork.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.cloud.compute.v1.TestIamPermissionsSubnetworkHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SubnetworkSettings$Builder this]
    (-> this (.testIamPermissionsSubnetworkSettings))))

