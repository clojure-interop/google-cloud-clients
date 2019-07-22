(ns com.google.cloud.monitoring.v3.stub.GrpcGroupServiceStub
  "gRPC stub implementation for Stackdriver Monitoring API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.monitoring.v3.stub GrpcGroupServiceStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.monitoring.v3.stub.GrpcGroupServiceStub`

  throws: java.io.IOException"
  (^com.google.cloud.monitoring.v3.stub.GrpcGroupServiceStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcGroupServiceStub/create client-context callable-factory))
  (^com.google.cloud.monitoring.v3.stub.GrpcGroupServiceStub [^com.google.cloud.monitoring.v3.stub.GroupServiceStubSettings settings]
    (GrpcGroupServiceStub/create settings)))

(defn list-groups-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListGroupsRequest,com.google.monitoring.v3.ListGroupsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGroupServiceStub this]
    (-> this (.listGroupsCallable))))

(defn delete-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.DeleteGroupRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGroupServiceStub this]
    (-> this (.deleteGroupCallable))))

(defn list-groups-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListGroupsRequest,com.google.cloud.monitoring.v3.GroupServiceClient$ListGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGroupServiceStub this]
    (-> this (.listGroupsPagedCallable))))

(defn update-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.UpdateGroupRequest,com.google.monitoring.v3.Group>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGroupServiceStub this]
    (-> this (.updateGroupCallable))))

(defn create-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.CreateGroupRequest,com.google.monitoring.v3.Group>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGroupServiceStub this]
    (-> this (.createGroupCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcGroupServiceStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcGroupServiceStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcGroupServiceStub this]
    (-> this (.shutdown))))

(defn list-group-members-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListGroupMembersRequest,com.google.cloud.monitoring.v3.GroupServiceClient$ListGroupMembersPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGroupServiceStub this]
    (-> this (.listGroupMembersPagedCallable))))

(defn close
  ""
  ([^GrpcGroupServiceStub this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcGroupServiceStub this]
    (-> this (.isTerminated))))

(defn list-group-members-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListGroupMembersRequest,com.google.monitoring.v3.ListGroupMembersResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGroupServiceStub this]
    (-> this (.listGroupMembersCallable))))

(defn shutdown-now
  ""
  ([^GrpcGroupServiceStub this]
    (-> this (.shutdownNow))))

(defn get-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.GetGroupRequest,com.google.monitoring.v3.Group>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcGroupServiceStub this]
    (-> this (.getGroupCallable))))

