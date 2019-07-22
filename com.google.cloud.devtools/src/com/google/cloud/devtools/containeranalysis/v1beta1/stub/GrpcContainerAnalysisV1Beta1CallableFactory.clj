(ns com.google.cloud.devtools.containeranalysis.v1beta1.stub.GrpcContainerAnalysisV1Beta1CallableFactory
  "gRPC callable factory implementation for Container Analysis API.

  This class is for advanced usage."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.devtools.containeranalysis.v1beta1.stub GrpcContainerAnalysisV1Beta1CallableFactory]))

(defn ->grpc-container-analysis-v-1-beta-1-callable-factory
  "Constructor."
  (^GrpcContainerAnalysisV1Beta1CallableFactory []
    (new GrpcContainerAnalysisV1Beta1CallableFactory )))

(defn create-unary-callable
  "grpc-call-settings - `com.google.api.gax.grpc.GrpcCallSettings`
  call-settings - `com.google.api.gax.rpc.UnaryCallSettings`
  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `<RequestT,ResponseT> com.google.api.gax.rpc.UnaryCallable<RequestT,ResponseT>`"
  ([^GrpcContainerAnalysisV1Beta1CallableFactory this ^com.google.api.gax.grpc.GrpcCallSettings grpc-call-settings ^com.google.api.gax.rpc.UnaryCallSettings call-settings ^com.google.api.gax.rpc.ClientContext client-context]
    (-> this (.createUnaryCallable grpc-call-settings call-settings client-context))))

(defn create-paged-callable
  "grpc-call-settings - `com.google.api.gax.grpc.GrpcCallSettings`
  paged-call-settings - `com.google.api.gax.rpc.PagedCallSettings`
  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `<RequestT,ResponseT,PagedListResponseT> com.google.api.gax.rpc.UnaryCallable<RequestT,PagedListResponseT>`"
  ([^GrpcContainerAnalysisV1Beta1CallableFactory this ^com.google.api.gax.grpc.GrpcCallSettings grpc-call-settings ^com.google.api.gax.rpc.PagedCallSettings paged-call-settings ^com.google.api.gax.rpc.ClientContext client-context]
    (-> this (.createPagedCallable grpc-call-settings paged-call-settings client-context))))

(defn create-batching-callable
  "grpc-call-settings - `com.google.api.gax.grpc.GrpcCallSettings`
  batching-call-settings - `com.google.api.gax.rpc.BatchingCallSettings`
  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `<RequestT,ResponseT> com.google.api.gax.rpc.UnaryCallable<RequestT,ResponseT>`"
  ([^GrpcContainerAnalysisV1Beta1CallableFactory this ^com.google.api.gax.grpc.GrpcCallSettings grpc-call-settings ^com.google.api.gax.rpc.BatchingCallSettings batching-call-settings ^com.google.api.gax.rpc.ClientContext client-context]
    (-> this (.createBatchingCallable grpc-call-settings batching-call-settings client-context))))

(defn create-operation-callable
  "grpc-call-settings - `com.google.api.gax.grpc.GrpcCallSettings`
  operation-call-settings - `com.google.api.gax.rpc.OperationCallSettings`
  client-context - `com.google.api.gax.rpc.ClientContext`
  operations-stub - `com.google.longrunning.stub.OperationsStub`

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  <RequestT,ResponseT,MetadataT> com.google.api.gax.rpc.OperationCallable<RequestT,ResponseT,MetadataT>`"
  ([^GrpcContainerAnalysisV1Beta1CallableFactory this ^com.google.api.gax.grpc.GrpcCallSettings grpc-call-settings ^com.google.api.gax.rpc.OperationCallSettings operation-call-settings ^com.google.api.gax.rpc.ClientContext client-context ^com.google.longrunning.stub.OperationsStub operations-stub]
    (-> this (.createOperationCallable grpc-call-settings operation-call-settings client-context operations-stub))))

(defn create-bidi-streaming-callable
  "grpc-call-settings - `com.google.api.gax.grpc.GrpcCallSettings`
  streaming-call-settings - `com.google.api.gax.rpc.StreamingCallSettings`
  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `<RequestT,ResponseT> com.google.api.gax.rpc.BidiStreamingCallable<RequestT,ResponseT>`"
  ([^GrpcContainerAnalysisV1Beta1CallableFactory this ^com.google.api.gax.grpc.GrpcCallSettings grpc-call-settings ^com.google.api.gax.rpc.StreamingCallSettings streaming-call-settings ^com.google.api.gax.rpc.ClientContext client-context]
    (-> this (.createBidiStreamingCallable grpc-call-settings streaming-call-settings client-context))))

(defn create-server-streaming-callable
  "grpc-call-settings - `com.google.api.gax.grpc.GrpcCallSettings`
  streaming-call-settings - `com.google.api.gax.rpc.ServerStreamingCallSettings`
  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `<RequestT,ResponseT> com.google.api.gax.rpc.ServerStreamingCallable<RequestT,ResponseT>`"
  ([^GrpcContainerAnalysisV1Beta1CallableFactory this ^com.google.api.gax.grpc.GrpcCallSettings grpc-call-settings ^com.google.api.gax.rpc.ServerStreamingCallSettings streaming-call-settings ^com.google.api.gax.rpc.ClientContext client-context]
    (-> this (.createServerStreamingCallable grpc-call-settings streaming-call-settings client-context))))

(defn create-client-streaming-callable
  "grpc-call-settings - `com.google.api.gax.grpc.GrpcCallSettings`
  streaming-call-settings - `com.google.api.gax.rpc.StreamingCallSettings`
  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `<RequestT,ResponseT> com.google.api.gax.rpc.ClientStreamingCallable<RequestT,ResponseT>`"
  ([^GrpcContainerAnalysisV1Beta1CallableFactory this ^com.google.api.gax.grpc.GrpcCallSettings grpc-call-settings ^com.google.api.gax.rpc.StreamingCallSettings streaming-call-settings ^com.google.api.gax.rpc.ClientContext client-context]
    (-> this (.createClientStreamingCallable grpc-call-settings streaming-call-settings client-context))))

