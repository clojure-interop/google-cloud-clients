(ns com.google.cloud.bigquery.datatransfer.v1.stub.DataTransferServiceStub
  "Base stub class for BigQuery Data Transfer API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery.datatransfer.v1.stub DataTransferServiceStub]))

(defn ->data-transfer-service-stub
  "Constructor."
  (^DataTransferServiceStub []
    (new DataTransferServiceStub )))

(defn delete-transfer-run-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataTransferServiceStub this]
    (-> this (.deleteTransferRunCallable))))

(defn list-transfer-logs-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsRequest,com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListTransferLogsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataTransferServiceStub this]
    (-> this (.listTransferLogsPagedCallable))))

(defn list-transfer-configs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest,com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataTransferServiceStub this]
    (-> this (.listTransferConfigsCallable))))

(defn list-data-sources-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesRequest,com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListDataSourcesPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataTransferServiceStub this]
    (-> this (.listDataSourcesPagedCallable))))

(defn schedule-transfer-runs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsRequest,com.google.cloud.bigquery.datatransfer.v1.ScheduleTransferRunsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataTransferServiceStub this]
    (-> this (.scheduleTransferRunsCallable))))

(defn list-data-sources-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesRequest,com.google.cloud.bigquery.datatransfer.v1.ListDataSourcesResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataTransferServiceStub this]
    (-> this (.listDataSourcesCallable))))

(defn create-transfer-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.CreateTransferConfigRequest,com.google.cloud.bigquery.datatransfer.v1.TransferConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataTransferServiceStub this]
    (-> this (.createTransferConfigCallable))))

(defn start-manual-transfer-runs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsRequest,com.google.cloud.bigquery.datatransfer.v1.StartManualTransferRunsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataTransferServiceStub this]
    (-> this (.startManualTransferRunsCallable))))

(defn check-valid-creds-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.CheckValidCredsRequest,com.google.cloud.bigquery.datatransfer.v1.CheckValidCredsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataTransferServiceStub this]
    (-> this (.checkValidCredsCallable))))

(defn delete-transfer-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.DeleteTransferConfigRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataTransferServiceStub this]
    (-> this (.deleteTransferConfigCallable))))

(defn get-transfer-run-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.GetTransferRunRequest,com.google.cloud.bigquery.datatransfer.v1.TransferRun>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataTransferServiceStub this]
    (-> this (.getTransferRunCallable))))

(defn update-transfer-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.UpdateTransferConfigRequest,com.google.cloud.bigquery.datatransfer.v1.TransferConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataTransferServiceStub this]
    (-> this (.updateTransferConfigCallable))))

(defn list-transfer-runs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsRequest,com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataTransferServiceStub this]
    (-> this (.listTransferRunsCallable))))

(defn close
  ""
  ([^DataTransferServiceStub this]
    (-> this (.close))))

(defn get-data-source-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.GetDataSourceRequest,com.google.cloud.bigquery.datatransfer.v1.DataSource>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataTransferServiceStub this]
    (-> this (.getDataSourceCallable))))

(defn list-transfer-configs-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.ListTransferConfigsRequest,com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListTransferConfigsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataTransferServiceStub this]
    (-> this (.listTransferConfigsPagedCallable))))

(defn get-transfer-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.GetTransferConfigRequest,com.google.cloud.bigquery.datatransfer.v1.TransferConfig>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataTransferServiceStub this]
    (-> this (.getTransferConfigCallable))))

(defn list-transfer-runs-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.ListTransferRunsRequest,com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListTransferRunsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataTransferServiceStub this]
    (-> this (.listTransferRunsPagedCallable))))

(defn list-transfer-logs-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsRequest,com.google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^DataTransferServiceStub this]
    (-> this (.listTransferLogsCallable))))

