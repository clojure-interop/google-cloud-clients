(ns com.google.cloud.pubsub.v1.stub.SubscriberStubSettings$Builder
  "Builder for SubscriberStubSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.pubsub.v1.stub SubscriberStubSettings$Builder]))

(defn get-subscription-settings
  "Returns the builder for the settings used for calls to getSubscription.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.pubsub.v1.GetSubscriptionRequest,com.google.pubsub.v1.Subscription>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SubscriberStubSettings$Builder this]
    (-> this (.getSubscriptionSettings))))

(defn pull-settings
  "Returns the builder for the settings used for calls to pull.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.pubsub.v1.PullRequest,com.google.pubsub.v1.PullResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SubscriberStubSettings$Builder this]
    (-> this (.pullSettings))))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.pubsub.v1.stub.SubscriberStubSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.pubsub.v1.stub.SubscriberStubSettings$Builder [^SubscriberStubSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn delete-snapshot-settings
  "Returns the builder for the settings used for calls to deleteSnapshot.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.pubsub.v1.DeleteSnapshotRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SubscriberStubSettings$Builder this]
    (-> this (.deleteSnapshotSettings))))

(defn test-iam-permissions-settings
  "Returns the builder for the settings used for calls to testIamPermissions.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SubscriberStubSettings$Builder this]
    (-> this (.testIamPermissionsSettings))))

(defn seek-settings
  "Returns the builder for the settings used for calls to seek.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.pubsub.v1.SeekRequest,com.google.pubsub.v1.SeekResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SubscriberStubSettings$Builder this]
    (-> this (.seekSettings))))

(defn set-iam-policy-settings
  "Returns the builder for the settings used for calls to setIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SubscriberStubSettings$Builder this]
    (-> this (.setIamPolicySettings))))

(defn build
  "returns: `com.google.cloud.pubsub.v1.stub.SubscriberStubSettings`

  throws: java.io.IOException"
  (^com.google.cloud.pubsub.v1.stub.SubscriberStubSettings [^SubscriberStubSettings$Builder this]
    (-> this (.build))))

(defn acknowledge-settings
  "Returns the builder for the settings used for calls to acknowledge.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.pubsub.v1.AcknowledgeRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SubscriberStubSettings$Builder this]
    (-> this (.acknowledgeSettings))))

(defn create-snapshot-settings
  "Returns the builder for the settings used for calls to createSnapshot.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.pubsub.v1.CreateSnapshotRequest,com.google.pubsub.v1.Snapshot>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SubscriberStubSettings$Builder this]
    (-> this (.createSnapshotSettings))))

(defn list-subscriptions-settings
  "Returns the builder for the settings used for calls to listSubscriptions.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.pubsub.v1.ListSubscriptionsRequest,com.google.pubsub.v1.ListSubscriptionsResponse,com.google.cloud.pubsub.v1.SubscriptionAdminClient$ListSubscriptionsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^SubscriberStubSettings$Builder this]
    (-> this (.listSubscriptionsSettings))))

(defn update-subscription-settings
  "Returns the builder for the settings used for calls to updateSubscription.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.pubsub.v1.UpdateSubscriptionRequest,com.google.pubsub.v1.Subscription>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SubscriberStubSettings$Builder this]
    (-> this (.updateSubscriptionSettings))))

(defn modify-push-config-settings
  "Returns the builder for the settings used for calls to modifyPushConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.pubsub.v1.ModifyPushConfigRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SubscriberStubSettings$Builder this]
    (-> this (.modifyPushConfigSettings))))

(defn streaming-pull-settings
  "Returns the builder for the settings used for calls to streamingPull.

  returns: `com.google.api.gax.rpc.StreamingCallSettings.Builder<com.google.pubsub.v1.StreamingPullRequest,com.google.pubsub.v1.StreamingPullResponse>`"
  (^com.google.api.gax.rpc.StreamingCallSettings.Builder [^SubscriberStubSettings$Builder this]
    (-> this (.streamingPullSettings))))

(defn delete-subscription-settings
  "Returns the builder for the settings used for calls to deleteSubscription.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.pubsub.v1.DeleteSubscriptionRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SubscriberStubSettings$Builder this]
    (-> this (.deleteSubscriptionSettings))))

(defn modify-ack-deadline-settings
  "Returns the builder for the settings used for calls to modifyAckDeadline.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.pubsub.v1.ModifyAckDeadlineRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SubscriberStubSettings$Builder this]
    (-> this (.modifyAckDeadlineSettings))))

(defn update-snapshot-settings
  "Returns the builder for the settings used for calls to updateSnapshot.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.pubsub.v1.UpdateSnapshotRequest,com.google.pubsub.v1.Snapshot>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SubscriberStubSettings$Builder this]
    (-> this (.updateSnapshotSettings))))

(defn get-iam-policy-settings
  "Returns the builder for the settings used for calls to getIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SubscriberStubSettings$Builder this]
    (-> this (.getIamPolicySettings))))

(defn unary-method-settings-builders
  "returns: `com.google.common.collect.ImmutableList<com.google.api.gax.rpc.UnaryCallSettings.Builder<?,?>>`"
  (^com.google.common.collect.ImmutableList [^SubscriberStubSettings$Builder this]
    (-> this (.unaryMethodSettingsBuilders))))

(defn create-subscription-settings
  "Returns the builder for the settings used for calls to createSubscription.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.pubsub.v1.Subscription,com.google.pubsub.v1.Subscription>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^SubscriberStubSettings$Builder this]
    (-> this (.createSubscriptionSettings))))

(defn list-snapshots-settings
  "Returns the builder for the settings used for calls to listSnapshots.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.pubsub.v1.ListSnapshotsRequest,com.google.pubsub.v1.ListSnapshotsResponse,com.google.cloud.pubsub.v1.SubscriptionAdminClient$ListSnapshotsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^SubscriberStubSettings$Builder this]
    (-> this (.listSnapshotsSettings))))

