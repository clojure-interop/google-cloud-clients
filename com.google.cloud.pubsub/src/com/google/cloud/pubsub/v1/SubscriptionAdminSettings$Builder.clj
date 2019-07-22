(ns com.google.cloud.pubsub.v1.SubscriptionAdminSettings$Builder
  "Builder for SubscriptionAdminSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.pubsub.v1 SubscriptionAdminSettings$Builder]))

(defn get-subscription-settings
  "Returns the builder for the settings used for calls to getSubscription.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.pubsub.v1.GetSubscriptionRequest,com.google.pubsub.v1.Subscription>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SubscriptionAdminSettings$Builder this]
    (-> this (.getSubscriptionSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.pubsub.v1.SubscriptionAdminSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.pubsub.v1.SubscriptionAdminSettings$Builder [^SubscriptionAdminSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn delete-snapshot-settings
  "Returns the builder for the settings used for calls to deleteSnapshot.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.pubsub.v1.DeleteSnapshotRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SubscriptionAdminSettings$Builder this]
    (-> this (.deleteSnapshotSettings))))

(defn test-iam-permissions-settings
  "Returns the builder for the settings used for calls to testIamPermissions.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SubscriptionAdminSettings$Builder this]
    (-> this (.testIamPermissionsSettings))))

(defn seek-settings
  "Returns the builder for the settings used for calls to seek.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.pubsub.v1.SeekRequest,com.google.pubsub.v1.SeekResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SubscriptionAdminSettings$Builder this]
    (-> this (.seekSettings))))

(defn set-iam-policy-settings
  "Returns the builder for the settings used for calls to setIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SubscriptionAdminSettings$Builder this]
    (-> this (.setIamPolicySettings))))

(defn build
  "returns: `com.google.cloud.pubsub.v1.SubscriptionAdminSettings`

  throws: java.io.IOException"
  (^com.google.cloud.pubsub.v1.SubscriptionAdminSettings [^SubscriptionAdminSettings$Builder this]
    (-> this (.build))))

(defn create-snapshot-settings
  "Returns the builder for the settings used for calls to createSnapshot.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.pubsub.v1.CreateSnapshotRequest,com.google.pubsub.v1.Snapshot>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SubscriptionAdminSettings$Builder this]
    (-> this (.createSnapshotSettings))))

(defn list-subscriptions-settings
  "Returns the builder for the settings used for calls to listSubscriptions.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.pubsub.v1.ListSubscriptionsRequest,com.google.pubsub.v1.ListSubscriptionsResponse,com.google.cloud.pubsub.v1.SubscriptionAdminClient$ListSubscriptionsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^SubscriptionAdminSettings$Builder this]
    (-> this (.listSubscriptionsSettings))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.pubsub.v1.stub.SubscriberStubSettings$Builder`"
  (^com.google.cloud.pubsub.v1.stub.SubscriberStubSettings$Builder [^SubscriptionAdminSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn update-subscription-settings
  "Returns the builder for the settings used for calls to updateSubscription.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.pubsub.v1.UpdateSubscriptionRequest,com.google.pubsub.v1.Subscription>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SubscriptionAdminSettings$Builder this]
    (-> this (.updateSubscriptionSettings))))

(defn modify-push-config-settings
  "Returns the builder for the settings used for calls to modifyPushConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.pubsub.v1.ModifyPushConfigRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SubscriptionAdminSettings$Builder this]
    (-> this (.modifyPushConfigSettings))))

(defn delete-subscription-settings
  "Returns the builder for the settings used for calls to deleteSubscription.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.pubsub.v1.DeleteSubscriptionRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SubscriptionAdminSettings$Builder this]
    (-> this (.deleteSubscriptionSettings))))

(defn update-snapshot-settings
  "Returns the builder for the settings used for calls to updateSnapshot.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.pubsub.v1.UpdateSnapshotRequest,com.google.pubsub.v1.Snapshot>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SubscriptionAdminSettings$Builder this]
    (-> this (.updateSnapshotSettings))))

(defn get-iam-policy-settings
  "Returns the builder for the settings used for calls to getIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SubscriptionAdminSettings$Builder this]
    (-> this (.getIamPolicySettings))))

(defn create-subscription-settings
  "Returns the builder for the settings used for calls to createSubscription.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.pubsub.v1.Subscription,com.google.pubsub.v1.Subscription>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SubscriptionAdminSettings$Builder this]
    (-> this (.createSubscriptionSettings))))

(defn list-snapshots-settings
  "Returns the builder for the settings used for calls to listSnapshots.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.pubsub.v1.ListSnapshotsRequest,com.google.pubsub.v1.ListSnapshotsResponse,com.google.cloud.pubsub.v1.SubscriptionAdminClient$ListSnapshotsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^SubscriptionAdminSettings$Builder this]
    (-> this (.listSnapshotsSettings))))

