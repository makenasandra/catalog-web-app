export * from './order.service';
import { OrderService } from './order.service';
export * from './product.service';
import { ProductService } from './product.service';
export const APIS = [OrderService, ProductService];
