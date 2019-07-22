(ns com.google.cloud.monitoring.v3.GroupServiceSettings$Builder
  "Builder for GroupServiceSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.monitoring.v3 GroupServiceSettings$Builder]))

(defn list-groups-settings
  "Returns the builder for the settings used for calls to listGroups.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.monitoring.v3.ListGroupsRequest,com.google.monitoring.v3.ListGroupsResponse,com.google.cloud.monitoring.v3.GroupServiceClient$ListGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^GroupServiceSettings$Builder this]
    (-> this (.listGroupsSettings))))

(defn list-group-members-settings
  "Returns the builder for the settings used for calls to listGroupMembers.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.monitoring.v3.ListGroupMembersRequest,com.google.monitoring.v3.ListGroupMembersResponse,com.google.cloud.monitoring.v3.GroupServiceClient$ListGroupMembersPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^GroupServiceSettings$Builder this]
    (-> this (.listGroupMembersSettings))))

(defn update-group-settings
  "Returns the builder for the settings used for calls to updateGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.monitoring.v3.UpdateGroupRequest,com.google.monitoring.v3.Group>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GroupServiceSettings$Builder this]
    (-> this (.updateGroupSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.monitoring.v3.GroupServiceSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.monitoring.v3.GroupServiceSettings$Builder [^GroupServiceSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn delete-group-settings
  "Returns the builder for the settings used for calls to deleteGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.monitoring.v3.DeleteGroupRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GroupServiceSettings$Builder this]
    (-> this (.deleteGroupSettings))))

(defn build
  "returns: `com.google.cloud.monitoring.v3.GroupServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.monitoring.v3.GroupServiceSettings [^GroupServiceSettings$Builder this]
    (-> this (.build))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.monitoring.v3.stub.GroupServiceStubSettings$Builder`"
  (^com.google.cloud.monitoring.v3.stub.GroupServiceStubSettings$Builder [^GroupServiceSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn create-group-settings
  "Returns the builder for the settings used for calls to createGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.monitoring.v3.CreateGroupRequest,com.google.monitoring.v3.Group>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GroupServiceSettings$Builder this]
    (-> this (.createGroupSettings))))

(defn get-group-settings
  "Returns the builder for the settings used for calls to getGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.monitoring.v3.GetGroupRequest,com.google.monitoring.v3.Group>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^GroupServiceSettings$Builder this]
    (-> this (.getGroupSettings))))

