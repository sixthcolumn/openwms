class WorkOrderAttachment < ActiveRecord::Base

  self.table_name = "work_order_attachments"

  belongs_to :work_order
  belongs_to :attachment
end
