(ns com.google.cloud.compute.v1.stub.HttpJsonSubnetworkStub
  "HTTP stub implementation for compute.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub HttpJsonSubnetworkStub]))

(def *-aggregated-list-subnetworks-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.AggregatedListSubnetworksHttpRequest,com.google.cloud.compute.v1.SubnetworkAggregatedList>"
  HttpJsonSubnetworkStub/aggregatedListSubnetworksMethodDescriptor)

(def *-delete-subnetwork-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.DeleteSubnetworkHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonSubnetworkStub/deleteSubnetworkMethodDescriptor)

(def *-expand-ip-cidr-range-subnetwork-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ExpandIpCidrRangeSubnetworkHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonSubnetworkStub/expandIpCidrRangeSubnetworkMethodDescriptor)

(def *-get-subnetwork-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetSubnetworkHttpRequest,com.google.cloud.compute.v1.Subnetwork>"
  HttpJsonSubnetworkStub/getSubnetworkMethodDescriptor)

(def *-get-iam-policy-subnetwork-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.GetIamPolicySubnetworkHttpRequest,com.google.cloud.compute.v1.Policy>"
  HttpJsonSubnetworkStub/getIamPolicySubnetworkMethodDescriptor)

(def *-insert-subnetwork-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.InsertSubnetworkHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonSubnetworkStub/insertSubnetworkMethodDescriptor)

(def *-list-subnetworks-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListSubnetworksHttpRequest,com.google.cloud.compute.v1.SubnetworkList>"
  HttpJsonSubnetworkStub/listSubnetworksMethodDescriptor)

(def *-list-usable-subnetworks-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.ListUsableSubnetworksHttpRequest,com.google.cloud.compute.v1.UsableSubnetworksAggregatedList>"
  HttpJsonSubnetworkStub/listUsableSubnetworksMethodDescriptor)

(def *-patch-subnetwork-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.PatchSubnetworkHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonSubnetworkStub/patchSubnetworkMethodDescriptor)

(def *-set-iam-policy-subnetwork-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetIamPolicySubnetworkHttpRequest,com.google.cloud.compute.v1.Policy>"
  HttpJsonSubnetworkStub/setIamPolicySubnetworkMethodDescriptor)

(def *-set-private-ip-google-access-subnetwork-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.SetPrivateIpGoogleAccessSubnetworkHttpRequest,com.google.cloud.compute.v1.Operation>"
  HttpJsonSubnetworkStub/setPrivateIpGoogleAccessSubnetworkMethodDescriptor)

(def *-test-iam-permissions-subnetwork-method-descriptor
  "Static Constant.

  type: com.google.api.gax.httpjson.ApiMethodDescriptor<com.google.cloud.compute.v1.TestIamPermissionsSubnetworkHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>"
  HttpJsonSubnetworkStub/testIamPermissionsSubnetworkMethodDescriptor)

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.httpjson.HttpJsonStubCallableFactory`

  returns: `com.google.cloud.compute.v1.stub.HttpJsonSubnetworkStub`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.stub.HttpJsonSubnetworkStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.httpjson.HttpJsonStubCallableFactory callable-factory]
    (HttpJsonSubnetworkStub/create client-context callable-factory))
  (^com.google.cloud.compute.v1.stub.HttpJsonSubnetworkStub [^com.google.cloud.compute.v1.stub.SubnetworkStubSettings settings]
    (HttpJsonSubnetworkStub/create settings)))

(defn list-usable-subnetworks-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListUsableSubnetworksHttpRequest,com.google.cloud.compute.v1.SubnetworkClient$ListUsableSubnetworksPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSubnetworkStub this]
    (-> this (.listUsableSubnetworksPagedCallable))))

(defn get-subnetwork-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetSubnetworkHttpRequest,com.google.cloud.compute.v1.Subnetwork>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSubnetworkStub this]
    (-> this (.getSubnetworkCallable))))

(defn patch-subnetwork-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.PatchSubnetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSubnetworkStub this]
    (-> this (.patchSubnetworkCallable))))

(defn set-private-ip-google-access-subnetwork-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetPrivateIpGoogleAccessSubnetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSubnetworkStub this]
    (-> this (.setPrivateIpGoogleAccessSubnetworkCallable))))

(defn list-usable-subnetworks-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListUsableSubnetworksHttpRequest,com.google.cloud.compute.v1.UsableSubnetworksAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSubnetworkStub this]
    (-> this (.listUsableSubnetworksCallable))))

(defn list-subnetworks-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListSubnetworksHttpRequest,com.google.cloud.compute.v1.SubnetworkClient$ListSubnetworksPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSubnetworkStub this]
    (-> this (.listSubnetworksPagedCallable))))

(defn test-iam-permissions-subnetwork-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.TestIamPermissionsSubnetworkHttpRequest,com.google.cloud.compute.v1.TestPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSubnetworkStub this]
    (-> this (.testIamPermissionsSubnetworkCallable))))

(defn list-subnetworks-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListSubnetworksHttpRequest,com.google.cloud.compute.v1.SubnetworkList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSubnetworkStub this]
    (-> this (.listSubnetworksCallable))))

(defn expand-ip-cidr-range-subnetwork-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ExpandIpCidrRangeSubnetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSubnetworkStub this]
    (-> this (.expandIpCidrRangeSubnetworkCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^HttpJsonSubnetworkStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^HttpJsonSubnetworkStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^HttpJsonSubnetworkStub this]
    (-> this (.shutdown))))

(defn insert-subnetwork-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.InsertSubnetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSubnetworkStub this]
    (-> this (.insertSubnetworkCallable))))

(defn delete-subnetwork-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DeleteSubnetworkHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSubnetworkStub this]
    (-> this (.deleteSubnetworkCallable))))

(defn close
  ""
  ([^HttpJsonSubnetworkStub this]
    (-> this (.close))))

(defn set-iam-policy-subnetwork-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetIamPolicySubnetworkHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSubnetworkStub this]
    (-> this (.setIamPolicySubnetworkCallable))))

(defn aggregated-list-subnetworks-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListSubnetworksHttpRequest,com.google.cloud.compute.v1.SubnetworkClient$AggregatedListSubnetworksPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSubnetworkStub this]
    (-> this (.aggregatedListSubnetworksPagedCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^HttpJsonSubnetworkStub this]
    (-> this (.isTerminated))))

(defn aggregated-list-subnetworks-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.AggregatedListSubnetworksHttpRequest,com.google.cloud.compute.v1.SubnetworkAggregatedList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSubnetworkStub this]
    (-> this (.aggregatedListSubnetworksCallable))))

(defn get-iam-policy-subnetwork-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetIamPolicySubnetworkHttpRequest,com.google.cloud.compute.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^HttpJsonSubnetworkStub this]
    (-> this (.getIamPolicySubnetworkCallable))))

(defn shutdown-now
  ""
  ([^HttpJsonSubnetworkStub this]
    (-> this (.shutdownNow))))

