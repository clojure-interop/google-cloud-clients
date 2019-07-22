(ns com.google.cloud.monitoring.v3.stub.GroupServiceStub
  "Base stub class for Stackdriver Monitoring API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.monitoring.v3.stub GroupServiceStub]))

(defn ->group-service-stub
  "Constructor."
  (^GroupServiceStub []
    (new GroupServiceStub )))

(defn list-groups-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListGroupsRequest,com.google.monitoring.v3.ListGroupsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GroupServiceStub this]
    (-> this (.listGroupsCallable))))

(defn delete-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.DeleteGroupRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GroupServiceStub this]
    (-> this (.deleteGroupCallable))))

(defn list-groups-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListGroupsRequest,com.google.cloud.monitoring.v3.GroupServiceClient$ListGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GroupServiceStub this]
    (-> this (.listGroupsPagedCallable))))

(defn update-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.UpdateGroupRequest,com.google.monitoring.v3.Group>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GroupServiceStub this]
    (-> this (.updateGroupCallable))))

(defn create-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.CreateGroupRequest,com.google.monitoring.v3.Group>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GroupServiceStub this]
    (-> this (.createGroupCallable))))

(defn list-group-members-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListGroupMembersRequest,com.google.cloud.monitoring.v3.GroupServiceClient$ListGroupMembersPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GroupServiceStub this]
    (-> this (.listGroupMembersPagedCallable))))

(defn close
  ""
  ([^GroupServiceStub this]
    (-> this (.close))))

(defn list-group-members-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListGroupMembersRequest,com.google.monitoring.v3.ListGroupMembersResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GroupServiceStub this]
    (-> this (.listGroupMembersCallable))))

(defn get-group-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.GetGroupRequest,com.google.monitoring.v3.Group>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GroupServiceStub this]
    (-> this (.getGroupCallable))))

