# Bindings for com.google.cloud.bigquery

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/com.google.cloud.bigquery "1.0.0"]
```

## Class Members Naming Conventions

| Class Member | Java | Clojure |
|:--|:--|:--|
| constructor | new File() | (->file) |
| instance method | getAnyValue() | (get-any-value) |
| instance field | instanceField | (-instance-field) |
| static method | staticMethod() | (*static-method) |
| static field | ANY_STATIC_FIELD | (*-any-static-field) |
| boolean field/method | isExists(), canUse() | (exists?), (can-use?) |

## Classes

- class **com.google.cloud.bigquery.Acl$Domain**
- enum **com.google.cloud.bigquery.Acl$Entity$Type**
- class **com.google.cloud.bigquery.Acl$Entity**
- class **com.google.cloud.bigquery.Acl$Group**
- class **com.google.cloud.bigquery.Acl$Role**
- class **com.google.cloud.bigquery.Acl$User**
- class **com.google.cloud.bigquery.Acl$View**
- class **com.google.cloud.bigquery.Acl**
- class **com.google.cloud.bigquery.BigQuery$DatasetDeleteOption**
- enum **com.google.cloud.bigquery.BigQuery$DatasetField**
- class **com.google.cloud.bigquery.BigQuery$DatasetListOption**
- class **com.google.cloud.bigquery.BigQuery$DatasetOption**
- enum **com.google.cloud.bigquery.BigQuery$JobField**
- class **com.google.cloud.bigquery.BigQuery$JobListOption**
- class **com.google.cloud.bigquery.BigQuery$JobOption**
- enum **com.google.cloud.bigquery.BigQuery$ModelField**
- class **com.google.cloud.bigquery.BigQuery$ModelListOption**
- class **com.google.cloud.bigquery.BigQuery$ModelOption**
- class **com.google.cloud.bigquery.BigQuery$QueryOption**
- class **com.google.cloud.bigquery.BigQuery$QueryResultsOption**
- enum **com.google.cloud.bigquery.BigQuery$RoutineField**
- class **com.google.cloud.bigquery.BigQuery$RoutineListOption**
- class **com.google.cloud.bigquery.BigQuery$RoutineOption**
- class **com.google.cloud.bigquery.BigQuery$TableDataListOption**
- enum **com.google.cloud.bigquery.BigQuery$TableField**
- class **com.google.cloud.bigquery.BigQuery$TableListOption**
- class **com.google.cloud.bigquery.BigQuery$TableOption**
- interface **com.google.cloud.bigquery.BigQuery**
- class **com.google.cloud.bigquery.BigQueryError**
- class **com.google.cloud.bigquery.BigQueryException**
- interface **com.google.cloud.bigquery.BigQueryFactory**
- class **com.google.cloud.bigquery.BigQueryOptions$Builder**
- class **com.google.cloud.bigquery.BigQueryOptions$DefaultBigQueryFactory**
- class **com.google.cloud.bigquery.BigQueryOptions$DefaultBigQueryRpcFactory**
- class **com.google.cloud.bigquery.BigQueryOptions**
- class **com.google.cloud.bigquery.BigtableColumn$Builder**
- class **com.google.cloud.bigquery.BigtableColumn**
- class **com.google.cloud.bigquery.BigtableColumnFamily$Builder**
- class **com.google.cloud.bigquery.BigtableColumnFamily**
- class **com.google.cloud.bigquery.BigtableOptions**
- class **com.google.cloud.bigquery.Clustering$Builder**
- class **com.google.cloud.bigquery.Clustering**
- class **com.google.cloud.bigquery.CopyJobConfiguration$Builder**
- class **com.google.cloud.bigquery.CopyJobConfiguration**
- class **com.google.cloud.bigquery.CsvOptions$Builder**
- class **com.google.cloud.bigquery.CsvOptions**
- class **com.google.cloud.bigquery.Dataset$Builder**
- class **com.google.cloud.bigquery.Dataset**
- class **com.google.cloud.bigquery.DatasetId**
- class **com.google.cloud.bigquery.DatasetInfo$Builder**
- class **com.google.cloud.bigquery.DatasetInfo**
- class **com.google.cloud.bigquery.DatastoreBackupOptions$Builder**
- class **com.google.cloud.bigquery.DatastoreBackupOptions**
- class **com.google.cloud.bigquery.EmptyTableResult**
- class **com.google.cloud.bigquery.EncryptionConfiguration$Builder**
- class **com.google.cloud.bigquery.EncryptionConfiguration**
- class **com.google.cloud.bigquery.ExternalTableDefinition$Builder**
- class **com.google.cloud.bigquery.ExternalTableDefinition**
- class **com.google.cloud.bigquery.ExtractJobConfiguration$Builder**
- class **com.google.cloud.bigquery.ExtractJobConfiguration**
- class **com.google.cloud.bigquery.Field$Builder**
- enum **com.google.cloud.bigquery.Field$Mode**
- class **com.google.cloud.bigquery.Field**
- class **com.google.cloud.bigquery.FieldList**
- enum **com.google.cloud.bigquery.FieldValue$Attribute**
- class **com.google.cloud.bigquery.FieldValue**
- class **com.google.cloud.bigquery.FieldValueList**
- class **com.google.cloud.bigquery.FormatOptions**
- class **com.google.cloud.bigquery.GoogleSheetsOptions$Builder**
- class **com.google.cloud.bigquery.GoogleSheetsOptions**
- class **com.google.cloud.bigquery.InsertAllRequest$Builder**
- class **com.google.cloud.bigquery.InsertAllRequest$RowToInsert**
- class **com.google.cloud.bigquery.InsertAllRequest**
- class **com.google.cloud.bigquery.InsertAllResponse**
- class **com.google.cloud.bigquery.Job$Builder**
- class **com.google.cloud.bigquery.Job**
- class **com.google.cloud.bigquery.JobConfiguration$Builder**
- enum **com.google.cloud.bigquery.JobConfiguration$Type**
- class **com.google.cloud.bigquery.JobConfiguration**
- class **com.google.cloud.bigquery.JobException**
- class **com.google.cloud.bigquery.JobId$Builder**
- class **com.google.cloud.bigquery.JobId**
- class **com.google.cloud.bigquery.JobInfo$Builder**
- enum **com.google.cloud.bigquery.JobInfo$CreateDisposition**
- enum **com.google.cloud.bigquery.JobInfo$SchemaUpdateOption**
- enum **com.google.cloud.bigquery.JobInfo$WriteDisposition**
- class **com.google.cloud.bigquery.JobInfo**
- class **com.google.cloud.bigquery.JobStatistics$CopyStatistics**
- class **com.google.cloud.bigquery.JobStatistics$ExtractStatistics**
- class **com.google.cloud.bigquery.JobStatistics$LoadStatistics**
- class **com.google.cloud.bigquery.JobStatistics$QueryStatistics$StatementType**
- class **com.google.cloud.bigquery.JobStatistics$QueryStatistics**
- class **com.google.cloud.bigquery.JobStatistics**
- class **com.google.cloud.bigquery.JobStatus$State**
- class **com.google.cloud.bigquery.JobStatus**
- class **com.google.cloud.bigquery.LegacySQLTypeName**
- interface **com.google.cloud.bigquery.LoadConfiguration$Builder**
- interface **com.google.cloud.bigquery.LoadConfiguration**
- class **com.google.cloud.bigquery.LoadJobConfiguration$Builder**
- class **com.google.cloud.bigquery.LoadJobConfiguration**
- class **com.google.cloud.bigquery.Model$Builder**
- class **com.google.cloud.bigquery.Model**
- class **com.google.cloud.bigquery.ModelId**
- class **com.google.cloud.bigquery.ModelInfo$Builder**
- class **com.google.cloud.bigquery.ModelInfo**
- class **com.google.cloud.bigquery.ModelTableDefinition$Builder**
- class **com.google.cloud.bigquery.ModelTableDefinition**
- class **com.google.cloud.bigquery.QueryJobConfiguration$Builder**
- enum **com.google.cloud.bigquery.QueryJobConfiguration$Priority**
- class **com.google.cloud.bigquery.QueryJobConfiguration**
- class **com.google.cloud.bigquery.QueryParameterValue$Builder**
- class **com.google.cloud.bigquery.QueryParameterValue**
- class **com.google.cloud.bigquery.QueryResponse**
- class **com.google.cloud.bigquery.QueryStage$QueryStep**
- class **com.google.cloud.bigquery.QueryStage**
- class **com.google.cloud.bigquery.Routine$Builder**
- class **com.google.cloud.bigquery.Routine**
- class **com.google.cloud.bigquery.RoutineArgument$Builder**
- class **com.google.cloud.bigquery.RoutineArgument**
- class **com.google.cloud.bigquery.RoutineId**
- class **com.google.cloud.bigquery.RoutineInfo$Builder**
- class **com.google.cloud.bigquery.RoutineInfo**
- class **com.google.cloud.bigquery.Schema**
- class **com.google.cloud.bigquery.StandardSQLDataType$Builder**
- class **com.google.cloud.bigquery.StandardSQLDataType**
- class **com.google.cloud.bigquery.StandardSQLField$Builder**
- class **com.google.cloud.bigquery.StandardSQLField**
- class **com.google.cloud.bigquery.StandardSQLStructType$Builder**
- class **com.google.cloud.bigquery.StandardSQLStructType**
- enum **com.google.cloud.bigquery.StandardSQLTypeName**
- class **com.google.cloud.bigquery.StandardTableDefinition$Builder**
- class **com.google.cloud.bigquery.StandardTableDefinition$StreamingBuffer**
- class **com.google.cloud.bigquery.StandardTableDefinition**
- class **com.google.cloud.bigquery.Table$Builder**
- class **com.google.cloud.bigquery.Table**
- class **com.google.cloud.bigquery.TableDataWriteChannel**
- class **com.google.cloud.bigquery.TableDefinition$Builder**
- class **com.google.cloud.bigquery.TableDefinition$Type**
- class **com.google.cloud.bigquery.TableDefinition**
- class **com.google.cloud.bigquery.TableId**
- class **com.google.cloud.bigquery.TableInfo$Builder**
- class **com.google.cloud.bigquery.TableInfo**
- class **com.google.cloud.bigquery.TableResult**
- class **com.google.cloud.bigquery.TimePartitioning$Builder**
- enum **com.google.cloud.bigquery.TimePartitioning$Type**
- class **com.google.cloud.bigquery.TimePartitioning**
- class **com.google.cloud.bigquery.TimelineSample$Builder**
- class **com.google.cloud.bigquery.TimelineSample**
- enum **com.google.cloud.bigquery.UserDefinedFunction$Type**
- class **com.google.cloud.bigquery.UserDefinedFunction**
- class **com.google.cloud.bigquery.ViewDefinition$Builder**
- class **com.google.cloud.bigquery.ViewDefinition**
- class **com.google.cloud.bigquery.WriteChannelConfiguration$Builder**
- class **com.google.cloud.bigquery.WriteChannelConfiguration**
- class **com.google.cloud.bigquery.benchmark.Benchmark**
- class **com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListDataSourcesFixedSizeCollection**
- class **com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListDataSourcesPage**
- class **com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListDataSourcesPagedResponse**
- class **com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListTransferConfigsFixedSizeCollection**
- class **com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListTransferConfigsPage**
- class **com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListTransferConfigsPagedResponse**
- class **com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListTransferLogsFixedSizeCollection**
- class **com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListTransferLogsPage**
- class **com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListTransferLogsPagedResponse**
- class **com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListTransferRunsFixedSizeCollection**
- class **com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListTransferRunsPage**
- class **com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient$ListTransferRunsPagedResponse**
- class **com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceClient**
- class **com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceSettings$Builder**
- class **com.google.cloud.bigquery.datatransfer.v1.DataTransferServiceSettings**
- class **com.google.cloud.bigquery.datatransfer.v1.SampleApp**
- class **com.google.cloud.bigquery.datatransfer.v1.stub.DataTransferServiceStub**
- class **com.google.cloud.bigquery.datatransfer.v1.stub.DataTransferServiceStubSettings$Builder**
- class **com.google.cloud.bigquery.datatransfer.v1.stub.DataTransferServiceStubSettings**
- class **com.google.cloud.bigquery.datatransfer.v1.stub.GrpcDataTransferServiceCallableFactory**
- class **com.google.cloud.bigquery.datatransfer.v1.stub.GrpcDataTransferServiceStub**
- interface **com.google.cloud.bigquery.spi.BigQueryRpcFactory**
- enum **com.google.cloud.bigquery.spi.v2.BigQueryRpc$Option**
- interface **com.google.cloud.bigquery.spi.v2.BigQueryRpc**
- class **com.google.cloud.bigquery.spi.v2.HttpBigQueryRpc**
- class **com.google.cloud.bigquery.storage.v1beta1.BaseBigQueryStorageClient**
- class **com.google.cloud.bigquery.storage.v1beta1.BaseBigQueryStorageSettings$Builder**
- class **com.google.cloud.bigquery.storage.v1beta1.BaseBigQueryStorageSettings**
- class **com.google.cloud.bigquery.storage.v1beta1.BigQueryStorageClient**
- class **com.google.cloud.bigquery.storage.v1beta1.BigQueryStorageSettings$Builder**
- class **com.google.cloud.bigquery.storage.v1beta1.BigQueryStorageSettings**
- class **com.google.cloud.bigquery.storage.v1beta1.stub.BigQueryStorageStub**
- class **com.google.cloud.bigquery.storage.v1beta1.stub.BigQueryStorageStubSettings$Builder**
- class **com.google.cloud.bigquery.storage.v1beta1.stub.BigQueryStorageStubSettings**
- class **com.google.cloud.bigquery.storage.v1beta1.stub.EnhancedBigQueryStorageStub**
- class **com.google.cloud.bigquery.storage.v1beta1.stub.EnhancedBigQueryStorageStubSettings$Builder**
- class **com.google.cloud.bigquery.storage.v1beta1.stub.EnhancedBigQueryStorageStubSettings**
- class **com.google.cloud.bigquery.storage.v1beta1.stub.GrpcBigQueryStorageCallableFactory**
- class **com.google.cloud.bigquery.storage.v1beta1.stub.GrpcBigQueryStorageStub**
- class **com.google.cloud.bigquery.storage.v1beta1.stub.readrows.ReadRowsResumptionStrategy**
- class **com.google.cloud.bigquery.testing.RemoteBigQueryHelper$BigQueryHelperException**
- class **com.google.cloud.bigquery.testing.RemoteBigQueryHelper**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
