(ns com.google.cloud.bigquery.datatransfer.v1.stub.GrpcDataTransferServiceStub
  "gRPC stub implementation for BigQuery Data Transfer API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery.datatransfer.v1.stub GrpcDataTransferServiceStub]))

(defn *create
  "client-context - `com.google.api.gax.rpc.ClientContext`
  callable-factory - `com.google.api.gax.grpc.GrpcStubCallableFactory`

  returns: `com.google.cloud.bigquery.datatransfer.v1.stub.GrpcDataTransferServiceStub`

  throws: java.io.IOException"
  (^com.google.cloud.bigquery.datatransfer.v1.stub.GrpcDataTransferServiceStub [^com.google.api.gax.rpc.ClientContext client-context ^com.google.api.gax.grpc.GrpcStubCallableFactory callable-factory]
    (GrpcDataTransferServiceStub/create client-context callable-factory))
  (^com.google.cloud.bigquery.datatransfer.v1.stub.GrpcDataTransferServiceStub [^com.google.cloud.bigquery.datatransfer.v1.stub.DataTransferServiceStubSettings settings]
    (GrpcDataTransferServiceStub/create settings)))

(defn delete-transfer-run-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataTransferServiceStub this]
    (-> this (.deleteTransferRunCallable))))

(defn list-transfer-logs-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsRequest,com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListTransferLogsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataTransferServiceStub this]
    (-> this (.listTransferLogsPagedCallable))))

(defn list-transfer-configs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest,com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataTransferServiceStub this]
    (-> this (.listTransferConfigsCallable))))

(defn list-data-sources-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesRequest,com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListDataSourcesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataTransferServiceStub this]
    (-> this (.listDataSourcesPagedCallable))))

(defn schedule-transfer-runs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsRequest,com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataTransferServiceStub this]
    (-> this (.scheduleTransferRunsCallable))))

(defn list-data-sources-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesRequest,com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataTransferServiceStub this]
    (-> this (.listDataSourcesCallable))))

(defn create-transfer-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.CreateTransferConfigRequest,com.google.cloud.bigquery.datatransfer.v1.TransferConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataTransferServiceStub this]
    (-> this (.createTransferConfigCallable))))

(defn start-manual-transfer-runs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsRequest,com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataTransferServiceStub this]
    (-> this (.startManualTransferRunsCallable))))

(defn check-valid-creds-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.CheckValidCredsRequest,com.google.cloud.bigquery.datatransfer.v1.CheckValidCredsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataTransferServiceStub this]
    (-> this (.checkValidCredsCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GrpcDataTransferServiceStub this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GrpcDataTransferServiceStub this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GrpcDataTransferServiceStub this]
    (-> this (.shutdown))))

(defn delete-transfer-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.DeleteTransferConfigRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataTransferServiceStub this]
    (-> this (.deleteTransferConfigCallable))))

(defn get-transfer-run-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.GetTransferRunRequest,com.google.cloud.bigquery.datatransfer.v1.TransferRun>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataTransferServiceStub this]
    (-> this (.getTransferRunCallable))))

(defn update-transfer-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.UpdateTransferConfigRequest,com.google.cloud.bigquery.datatransfer.v1.TransferConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataTransferServiceStub this]
    (-> this (.updateTransferConfigCallable))))

(defn list-transfer-runs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsRequest,com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataTransferServiceStub this]
    (-> this (.listTransferRunsCallable))))

(defn close
  ""
  ([^GrpcDataTransferServiceStub this]
    (-> this (.close))))

(defn get-data-source-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.GetDataSourceRequest,com.google.cloud.bigquery.datatransfer.v1.DataSource>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataTransferServiceStub this]
    (-> this (.getDataSourceCallable))))

(defn list-transfer-configs-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest,com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListTransferConfigsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataTransferServiceStub this]
    (-> this (.listTransferConfigsPagedCallable))))

(defn get-transfer-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.GetTransferConfigRequest,com.google.cloud.bigquery.datatransfer.v1.TransferConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataTransferServiceStub this]
    (-> this (.getTransferConfigCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GrpcDataTransferServiceStub this]
    (-> this (.isTerminated))))

(defn list-transfer-runs-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsRequest,com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListTransferRunsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataTransferServiceStub this]
    (-> this (.listTransferRunsPagedCallable))))

(defn list-transfer-logs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsRequest,com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GrpcDataTransferServiceStub this]
    (-> this (.listTransferLogsCallable))))

(defn shutdown-now
  ""
  ([^GrpcDataTransferServiceStub this]
    (-> this (.shutdownNow))))

