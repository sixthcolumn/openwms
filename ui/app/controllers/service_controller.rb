class ServiceController < ApplicationController

  
  def index

    # Default query of work to visualize
    @orders = WorkOrder.where("status != 'closed' and kind = 'service'")


    #@mockOrders =
#      [
#       WorkOrder.new(:id => 1001, :work_order_name => "M-1001", :status => "MOCK - Fault", :created_at =>"July 9, 2015 @ 19:32", :created_by => "Mock Operator 1", :internal_floor => "Arc-Flash.png"),
#       WorkOrder.new(:id => 1002, :work_order_name => "M-1002", :status => "MOCK - Storm Advisory", :created_at =>"July 9, 2015 @ 19:32", :created_by => "Mock Weather Agent", :internal_floor => "StormTracker.png"),
#       WorkOrder.new(:id => 1003, :work_order_name => "M-1005", :status => "MOCK - External", :created_at =>"July 9, 2015 @ 19:32", :created_by => "MOCK", :internal_floor => "EDITED-Utility-truck-crews-keep-working.png"),
#       WorkOrder.new(:id => 1003, :work_order_name => "M-1003", :status => "MOCK - New", :created_at =>"July 9, 2015 @ 19:32", :created_by => "MOCK"),
#       WorkOrder.new(:id => 1004, :work_order_name => "M-1004", :status => "MOCK - Scheduled", :created_at =>"July 9, 2015 @ 19:32", :created_by => "MOCK")
#      ]
    
  end

end

