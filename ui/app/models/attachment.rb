class Attachment < ActiveRecord::Base

  self.table_name = "attachment"

  has_and_belongs_to_many  :work_orders, join_table: "work_order_attachments"

  # Attachment.inheritance_column
  # http://apidock.com/rails/ActiveRecord/Base/inheritance_column/class
  self.inheritance_column = 'none'
  def attachment
    nil
  end

  def poster_filename
    "#{filename}"
  end

end
