(ns com.google.cloud.compute.v1.stub.SubnetworkStub
  "Base stub class for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub SubnetworkStub]))

(defn ->subnetwork-stub
  "Constructor."
  (^SubnetworkStub []
    (new SubnetworkStub )))

(defn list-usable-subnetworks-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListUsableSubnetworksHttpRequest,com.google.cloud.compute.v1.SubnetworkClient$ListUsableSubnetworksPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubnetworkStub this]
    (-> this (.listUsableSubnetworksPagedCallable))))

(defn get-subnetwork-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetSubnetworkHttpRequest,com.google.cloud.compute.v1.Subnetwork>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubnetworkStub this]
    (-> this (.getSubnetworkCallable))))

(defn patch-subnetwork-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchSubnetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubnetworkStub this]
    (-> this (.patchSubnetworkCallable))))

(defn set-private-ip-google-access-subnetwork-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetPrivateIpGoogleAccessSubnetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubnetworkStub this]
    (-> this (.setPrivateIpGoogleAccessSubnetworkCallable))))

(defn list-usable-subnetworks-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListUsableSubnetworksHttpRequest,com.google.cloud.compute.v1.UsableSubnetworksAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubnetworkStub this]
    (-> this (.listUsableSubnetworksCallable))))

(defn list-subnetworks-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListSubnetworksHttpRequest,com.google.cloud.compute.v1.SubnetworkClient$ListSubnetworksPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubnetworkStub this]
    (-> this (.listSubnetworksPagedCallable))))

(defn test-iam-permissions-subnetwork-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.TestIamPermissionsSubnetworkHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubnetworkStub this]
    (-> this (.testIamPermissionsSubnetworkCallable))))

(defn list-subnetworks-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListSubnetworksHttpRequest,com.google.cloud.compute.v1.SubnetworkList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubnetworkStub this]
    (-> this (.listSubnetworksCallable))))

(defn expand-ip-cidr-range-subnetwork-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ExpandIpCidrRangeSubnetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubnetworkStub this]
    (-> this (.expandIpCidrRangeSubnetworkCallable))))

(defn insert-subnetwork-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertSubnetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubnetworkStub this]
    (-> this (.insertSubnetworkCallable))))

(defn delete-subnetwork-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteSubnetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubnetworkStub this]
    (-> this (.deleteSubnetworkCallable))))

(defn close
  ""
  ([^SubnetworkStub this]
    (-> this (.close))))

(defn set-iam-policy-subnetwork-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetIamPolicySubnetworkHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubnetworkStub this]
    (-> this (.setIamPolicySubnetworkCallable))))

(defn aggregated-list-subnetworks-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListSubnetworksHttpRequest,com.google.cloud.compute.v1.SubnetworkClient$AggregatedListSubnetworksPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubnetworkStub this]
    (-> this (.aggregatedListSubnetworksPagedCallable))))

(defn aggregated-list-subnetworks-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListSubnetworksHttpRequest,com.google.cloud.compute.v1.SubnetworkAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubnetworkStub this]
    (-> this (.aggregatedListSubnetworksCallable))))

(defn get-iam-policy-subnetwork-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetIamPolicySubnetworkHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubnetworkStub this]
    (-> this (.getIamPolicySubnetworkCallable))))

