(ns com.google.cloud.pubsub.v1.stub.GrpcSubscriberStub
  "gRPC stub implementation for Google Cloud Pub/Sub API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.pubsub.v1.stub GrpcSubscriberStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.pubsub.v1.stub.GrpcSubscriberStub`

  throws: java.io.IOException"
  (^com.google.cloud.pubsub.v1.stub.GrpcSubscriberStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcSubscriberStub/create client-context callable-factory))
  (^com.google.cloud.pubsub.v1.stub.GrpcSubscriberStub [^com.google.cloud.pubsub.v1.stub.SubscriberStubSettings settings]
    (GrpcSubscriberStub/create settings)))

(defn list-snapshots-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.ListSnapshotsRequest,com.google.pubsub.v1.ListSnapshotsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSubscriberStub this]
    (-> this (.listSnapshotsCallable))))

(defn acknowledge-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.AcknowledgeRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSubscriberStub this]
    (-> this (.acknowledgeCallable))))

(defn get-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSubscriberStub this]
    (-> this (.getIamPolicyCallable))))

(defn pull-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.PullRequest,com.google.pubsub.v1.PullResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSubscriberStub this]
    (-> this (.pullCallable))))

(defn list-subscriptions-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.ListSubscriptionsRequest,com.google.pubsub.v1.ListSubscriptionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSubscriberStub this]
    (-> this (.listSubscriptionsCallable))))

(defn modify-ack-deadline-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.ModifyAckDeadlineRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSubscriberStub this]
    (-> this (.modifyAckDeadlineCallable))))

(defn create-snapshot-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.CreateSnapshotRequest,com.google.pubsub.v1.Snapshot>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSubscriberStub this]
    (-> this (.createSnapshotCallable))))

(defn seek-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.SeekRequest,com.google.pubsub.v1.SeekResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSubscriberStub this]
    (-> this (.seekCallable))))

(defn update-subscription-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.UpdateSubscriptionRequest,com.google.pubsub.v1.Subscription>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSubscriberStub this]
    (-> this (.updateSubscriptionCallable))))

(defn list-subscriptions-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.ListSubscriptionsRequest,com.google.cloud.pubsub.v1.SubscriptionAdminClient$ListSubscriptionsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSubscriberStub this]
    (-> this (.listSubscriptionsPagedCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcSubscriberStub this]
    (-> this (.isShutdown))))

(defn get-subscription-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.GetSubscriptionRequest,com.google.pubsub.v1.Subscription>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSubscriberStub this]
    (-> this (.getSubscriptionCallable))))

(defn streaming-pull-callable
  "returns: `com.google.api.gax.rpc.BidiStreamingCallable<com.google.pubsub.v1.StreamingPullRequest,com.google.pubsub.v1.StreamingPullResponse>`"
  (^com.google.api.gax.rpc.BidiStreamingCallable [^GrpcSubscriberStub this]
    (-> this (.streamingPullCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcSubscriberStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcSubscriberStub this]
    (-> this (.shutdown))))

(defn modify-push-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.ModifyPushConfigRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSubscriberStub this]
    (-> this (.modifyPushConfigCallable))))

(defn update-snapshot-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.UpdateSnapshotRequest,com.google.pubsub.v1.Snapshot>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSubscriberStub this]
    (-> this (.updateSnapshotCallable))))

(defn delete-snapshot-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.DeleteSnapshotRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSubscriberStub this]
    (-> this (.deleteSnapshotCallable))))

(defn set-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSubscriberStub this]
    (-> this (.setIamPolicyCallable))))

(defn close
  ""
  ([^GrpcSubscriberStub this]
    (-> this (.close))))

(defn test-iam-permissions-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSubscriberStub this]
    (-> this (.testIamPermissionsCallable))))

(defn create-subscription-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.Subscription,com.google.pubsub.v1.Subscription>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSubscriberStub this]
    (-> this (.createSubscriptionCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcSubscriberStub this]
    (-> this (.isTerminated))))

(defn delete-subscription-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.DeleteSubscriptionRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSubscriberStub this]
    (-> this (.deleteSubscriptionCallable))))

(defn list-snapshots-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.ListSnapshotsRequest,com.google.cloud.pubsub.v1.SubscriptionAdminClient$ListSnapshotsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcSubscriberStub this]
    (-> this (.listSnapshotsPagedCallable))))

(defn shutdown-now
  ""
  ([^GrpcSubscriberStub this]
    (-> this (.shutdownNow))))

