(ns com.google.cloud.pubsub.v1.TopicAdminSettings$Builder
  "Builder for TopicAdminSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.pubsub.v1 TopicAdminSettings$Builder]))

(defn apply-to-all-unary-methods
  "Applies the given settings updater function to all of the unary API methods in this service.

   Note: This method does not support applying settings to streaming methods.

  settings-updater - `com.google.api.core.ApiFunction`

  returns: `com.google.cloud.pubsub.v1.TopicAdminSettings$Builder`

  throws: java.lang.Exception"
  (^com.google.cloud.pubsub.v1.TopicAdminSettings$Builder [^TopicAdminSettings$Builder this ^com.google.api.core.ApiFunction settings-updater]
    (-> this (.applyToAllUnaryMethods settings-updater))))

(defn test-iam-permissions-settings
  "Returns the builder for the settings used for calls to testIamPermissions.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TopicAdminSettings$Builder this]
    (-> this (.testIamPermissionsSettings))))

(defn list-topic-subscriptions-settings
  "Returns the builder for the settings used for calls to listTopicSubscriptions.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.pubsub.v1.ListTopicSubscriptionsRequest,com.google.pubsub.v1.ListTopicSubscriptionsResponse,com.google.cloud.pubsub.v1.TopicAdminClient$ListTopicSubscriptionsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^TopicAdminSettings$Builder this]
    (-> this (.listTopicSubscriptionsSettings))))

(defn list-topics-settings
  "Returns the builder for the settings used for calls to listTopics.

  returns: `com.google.api.gax.rpc.PagedCallSettings.Builder<com.google.pubsub.v1.ListTopicsRequest,com.google.pubsub.v1.ListTopicsResponse,com.google.cloud.pubsub.v1.TopicAdminClient$ListTopicsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings.Builder [^TopicAdminSettings$Builder this]
    (-> this (.listTopicsSettings))))

(defn get-topic-settings
  "Returns the builder for the settings used for calls to getTopic.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.pubsub.v1.GetTopicRequest,com.google.pubsub.v1.Topic>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TopicAdminSettings$Builder this]
    (-> this (.getTopicSettings))))

(defn set-iam-policy-settings
  "Returns the builder for the settings used for calls to setIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TopicAdminSettings$Builder this]
    (-> this (.setIamPolicySettings))))

(defn build
  "returns: `com.google.cloud.pubsub.v1.TopicAdminSettings`

  throws: java.io.IOException"
  (^com.google.cloud.pubsub.v1.TopicAdminSettings [^TopicAdminSettings$Builder this]
    (-> this (.build))))

(defn delete-topic-settings
  "Returns the builder for the settings used for calls to deleteTopic.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.pubsub.v1.DeleteTopicRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TopicAdminSettings$Builder this]
    (-> this (.deleteTopicSettings))))

(defn get-stub-settings-builder
  "returns: `com.google.cloud.pubsub.v1.stub.PublisherStubSettings$Builder`"
  (^com.google.cloud.pubsub.v1.stub.PublisherStubSettings$Builder [^TopicAdminSettings$Builder this]
    (-> this (.getStubSettingsBuilder))))

(defn create-topic-settings
  "Returns the builder for the settings used for calls to createTopic.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.pubsub.v1.Topic,com.google.pubsub.v1.Topic>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TopicAdminSettings$Builder this]
    (-> this (.createTopicSettings))))

(defn get-iam-policy-settings
  "Returns the builder for the settings used for calls to getIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TopicAdminSettings$Builder this]
    (-> this (.getIamPolicySettings))))

(defn update-topic-settings
  "Returns the builder for the settings used for calls to updateTopic.

  returns: `com.google.api.gax.rpc.UnaryCallSettings.Builder<com.google.pubsub.v1.UpdateTopicRequest,com.google.pubsub.v1.Topic>`"
  (^com.google.api.gax.rpc.UnaryCallSettings.Builder [^TopicAdminSettings$Builder this]
    (-> this (.updateTopicSettings))))

